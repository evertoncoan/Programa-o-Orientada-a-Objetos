#include <bits/stdc++.h>
using namespace std;

class Grafo
{
public:
    vector<string> rotulos;
    vector<vector<pair<int, float> >> adj;
    int V;
    int E;

    Grafo(string arquivo)
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
            if (line == "*edges")
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
            int a, b;
            float c;

            if (!(iss >> a >> b >> c)) {} else
            {
                //cout << a << " " << b << " " << c << endl;
                adicionarAresta(a, b, c);
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

    vector<int> vizinhos(int v)
    {
        vector<int> vizinhanca;
        for (auto it = adj[v-1].begin(); it!=adj[v-1].end(); it++)
        {
            int vizinho = it->first;
            vizinhanca.push_back(vizinho+1);
        }
        return vizinhanca;
    }

    bool haAresta(int u, int v)
    {
        int vertice;
        for (auto it = adj[u-1].begin(); it!=adj[u-1].end(); it++)
        {
            vertice = it->first;
            if ((v - 1) == vertice)
            {
                return true;
            }
        }
        return false;
    }

    float peso(int u, int v)
    {
        int vertice;
        for (auto it = adj[u-1].begin(); it!=adj[u-1].end(); it++)
        {
            vertice = it->first;
            if ((v - 1) == vertice)
            {
                return it->second;
            }
        }
        return numeric_limits<float>::max();
    }

    void adicionarAresta(int u, int v, float w)
    {
        adj[u-1].push_back(make_pair(v-1, w));
        //cout << "U" << endl;
        adj[v-1].push_back(make_pair(u-1, w));
        //cout << "V" << endl;
    }

    void imprimirGrafo()
    {
        int v;
        float w;
        for (int u = 0; u < V; u++)
        {
            cout << "Vértice " << u+1 << " está conectado com \n";
            for (auto it = adj[u].begin(); it!=adj[u].end(); it++)
            {
                v = it->first;
                w = it->second;
                cout << "\tVértice " << v+1 << " e possui aresta de peso = "
                     << w << "\n";
            }
            cout << "\n";
        }
    }

    void buscas(int s)
    {
        vector<bool> visitado;
        vector<int> distancia;

        for(int i = 0; i < V; i++)
        {
            visitado.push_back(false);
            distancia.push_back(numeric_limits<int>::min());
        }

        visitado[s-1] = true;
        distancia[s-1] = 0;

        queue<int> fila;
        fila.push(s-1);

        int u;
        while(!fila.empty())
        {
            u = fila.front();
            fila.pop();
            for (auto it = adj[u].begin(); it!=adj[u].end(); it++)
            {
                if (visitado[it->first] == false)
                {
                    visitado[it->first] = true;
                    distancia[it->first] = distancia[u] + 1;
                    fila.push(it->first);
                }
            }
        }

        for(int i = 0; i <= *max_element(distancia.begin(), distancia.end()); i++)
        {
            cout << i << ": ";
            for(int j = 0; j < distancia.size(); j++)
            {
                if(distancia[j] == i)
                {
                    cout << j+1 << ",";
                }
            }
            cout << endl;
        }

        /*for (auto i : distancia)
            cout << i << endl;*/
    }

    void dijkstra(int s)
    {
        vector<int> distancia;
        vector<int> antecessor;
        list<int> vertices;

        for(int i = 0; i < V; i++)
        {
            distancia.push_back(numeric_limits<int>::max());
            antecessor.push_back(s);
            vertices.push_back(i);
        }

        distancia[s-1] = 0;

        while(!vertices.empty())
        {
            int u = numeric_limits<int>::max();
            for (auto i : vertices)
            {
                if(distancia[i] < u)
                {
                    u = i;
                }
            }

            vertices.remove(u);

            for (auto v : vizinhos(u+1))
            {
                //cout << "v: " << v << endl;
                if(distancia[v-1] > distancia[u] + peso(u+1, v))
                {
                    distancia[v-1] = distancia[u] + peso(u+1, v);
                    antecessor[v-1] = u+1;
                }
            }
        }
        /*for (auto i : distancia)
                cout << "distancia: " << i << endl;
        for(int i = 0; i < V; i++)
        {
            cout << i + 1 << ": " << antecessor[i] << endl;
        }*/

        stack <int> pilha;

        for(int i = 0; i < V; i++)
        {
            if (i + 1 != s)
            {
                int antes = antecessor[i];
                pilha.push(antes);
                while(antes != s)
                {
                    //cout << antes << endl;
                    antes = antecessor[antes-1];
                    pilha.push(antes);
                }

                cout << i + 1 << ": ";
                while(!pilha.empty())
                {
                    cout << pilha.top() << ",";
                    pilha.pop();
                }
                cout << i + 1 << "; d=" << distancia[i] << endl;
            } else {
                cout << i + 1 << ": " << i + 1 << "; d=" << distancia[i] << endl;
            }
        }
    }

    void floydWarshall()
    {
        float distancia[V][V];

        for(int i = 0; i < V; i++)
        {
            for(int j = 0; j < V; j++)
            {
                if(i == j)
                {
                    distancia[i][j] = 0;
                } else {
                    distancia[i][j] = peso(i+1, j+1);
                }
            }
        }

        for(int k = 0; k < V; k++)
        {
            for(int u = 0; u < V; u++)
            {
                for(int v = 0; v < V; v++)
                {
                    if(distancia[u][k] + distancia[k][v] < distancia[u][v])
                    {
                        distancia[u][v] = distancia[u][k] + distancia[k][v];
                    }
                }
            }
        }

        for(int i = 0; i < V; i++)
        {
            cout << i + 1 << ": ";
            for(int j = 0; j < V; j++)
            {
                cout << distancia[i][j] << " ";
            }
            cout << endl;
        }
    }
};
