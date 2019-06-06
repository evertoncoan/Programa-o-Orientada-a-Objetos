#include <bits/stdc++.h>
using namespace std;

class GrafoDirigido
{
public:
    vector<string> rotulos;
    vector<vector<int>> adj;
    int V;
    int E;

    GrafoDirigido(string arquivo)
    {
        char data[100];
        ifstream infile(arquivo);

        infile >> data;
        //cout << data << endl;

        E = 0;
        infile >> V;
        adj.resize(V);

        string line;
        while (getline(infile, line))
        {
            if (line == "*arcs")
            {
                 break;
            } else {
                istringstream iss(line);
                //https://regex101.com/r/nQyp5c/1
                line = regex_replace(line, regex("(\\d+)\\s+(?:\"(.+)\"|([^\\n]))"), "$2$3");
                //cout << line << endl;
                rotulos.push_back(line);
            }
        }

        /*for (auto i : rotulos)
            cout << i << endl;*/

        while (getline(infile, line))
        {
            istringstream iss(line);
            int a, b, c;

            if (!(iss >> a >> b >> c)) {} else
            {
                //cout << a << " " << b << " " << c << endl;
                adicionarAresta(a, b);
                E++;
            }
        }
    }

    int qtdVertices()
    {
        return V;
    }

    int qtdArestas()
    {
        return E;
    }

    int grau(int v)
    {
        return adj[v-1].size();
    }

    string rotulo(int v)
    {
        return rotulos[v];
    }

    vector<int> vizinhos(vector<vector<int>> grafo, int v)
    {
        vector<int> vizinhanca;
        for (auto vizinho : grafo[v-1])
        {
            vizinhanca.push_back(vizinho+1);
        }
        return vizinhanca;
    }

    bool haAresta(int u, int v)
    {
        int vertice;
        for (auto vertice : adj[u-1])
        {
            if ((v - 1) == vertice)
            {
                return true;
            }
        }
        return false;
    }

    void adicionarAresta(int u, int v)
    {
        adj[u-1].push_back(v-1);
        //cout << "U" << endl;
    }

    void imprimirGrafo()
    {
        int v;
        float w;
        for (int u = 0; u < V; u++)
        {
            cout << "Vértice " << u+1 << " está conectado com \n";
            for (auto v : adj[u])
            {
                cout << "\tVértice " << v+1 << "\n";
            }
            cout << "\n";
        }
    }

    void componentesFortementeConexas()
    {
        vector<bool> C;
        vector<int> T;
        vector<int> F;
        vector<int> A;

        dfs(C, T, F, A);

        vector<vector<int>> transposto;
        transposto.resize(V);

        for(int u = 0; u < V; u++)
        {
            for (auto v : vizinhos(adj, u+1))
            {
                transposto[v-1].push_back(u);
            }
        }

        dfsAdaptado(transposto, C, T, F, A);

        int posicaoMaior;
        while (*max_element(T.begin(), T.end()) != -1)
        {
            posicaoMaior = distance(T.begin(), std::max_element(T.begin(), T.end()));
            cout << posicaoMaior + 1 << ",";
            if (A[posicaoMaior] == -1)
            {
                cout << endl;
            }

            T[posicaoMaior] = -1;
        }
    }

    void dfs(vector<bool>& C, vector<int>& T, vector<int>& F, vector<int>& A)
    {
        int tempo = 0;

        for(int i = 0; i < V; i++)
        {
            C.push_back(false);
            T.push_back(numeric_limits<int>::max());
            F.push_back(numeric_limits<int>::max());
            A.push_back(-1);
        }

        for(int u = 0; u < V; u++)
        {
            if (C[u] == false)
            {
                dfsVisit(adj, u, C, T, F, A, tempo);
            }
        }
    }

    void dfsAdaptado(vector<vector<int>> transposto, vector<bool>& C, vector<int>& T, vector<int>& F,
                     vector<int>& A)
    {
        vector<int> decrescente;
        int maior;

        for(int i = 0; i < V; i++)
        {
            maior = distance(F.begin(), std::max_element(F.begin(), F.end()));
            decrescente.push_back(maior);
            F[maior] = -1;
        }

        int tempo = 0;

        for(int i = 0; i < V; i++)
        {
            C[i] = false;
            T[i] = numeric_limits<int>::max();
            F[i] = numeric_limits<int>::max();
            A[i] = -1;
        }

        for(auto u : decrescente)
        {
            if (C[u] == false)
            {
                dfsVisit(transposto, u, C, T, F, A, tempo);
            }
        }
    }

    void dfsVisit(vector<vector<int>> grafo, int& v, vector<bool>& C, vector<int>& T, vector<int>& F,
                  vector<int>& A, int& tempo)
    {
        C[v] = true;
        tempo = tempo + 1;
        T[v] = tempo;
        for (auto u : vizinhos(grafo, v+1))
        {
            u--;
            if (C[u] == false)
            {
                A[u] = v;
                dfsVisit(grafo, u, C, T, F, A, tempo);
            }
        }
        tempo = tempo + 1;
        F[v] = tempo;
    }

    void dfsOrdenacaoTopologica()
    {
        vector<bool> C;
        vector<int> T;
        vector<int> F;

        int tempo = 0;

        for(int i = 0; i < V; i++)
        {
            C.push_back(false);
            T.push_back(numeric_limits<int>::max());
            F.push_back(numeric_limits<int>::max());
        }

        list<int> O;

        for(int u = 0; u < V; u++)
        {
            if (C[u] == false)
            {
                dfsVisitOT(u, C, T, F, tempo, O);
            }
        }

        for (auto i : O)
            cout << rotulo(i+1) << " --> ";
        cout << endl;
    }

    void dfsVisitOT(int& v, vector<bool>& C, vector<int>& T, vector<int>& F, int& tempo, list<int>& O)
    {
        C[v] = true;
        tempo = tempo + 1;
        T[v] = tempo;
        for (auto u : vizinhos(adj, v+1))
        {
            u--;
            if (C[u] == false)
            {
                dfsVisitOT(u, C, T, F, tempo, O);
            }
        }
        tempo = tempo + 1;
        F[v] = tempo;
        O.push_front(v);
    }

    void edmondsKarp(int s, int t)
    {
        vector<bool> C;
        vector<int> A;

        for(int i = 0; i < V; i++)
        {
            C.push_back(false);
            A.push_back(-1);
        }

        queue<int> Q;
        Q.push(s);

        int u;
        while(!Q.empty())
        {
            u = Q.front();
            Q.pop();
            for (auto v : vizinhos(adj, u))
            {
                v--;
                u--;
                t--;
                s--;
                if (C[v] == false)//......
                {
                    C[v] = true;
                    A[v] = u;

                    if (v == t)
                    {
                        p = t;
                        w = t;
                        while (w != s)
                        {

                        }
                    }
                }
            }
        }
    }
};
