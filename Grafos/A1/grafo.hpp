#include <bits/stdc++.h>
using namespace std;

class Grafo
{
public:
    vector<string> rotulos;
    vector<vector<pair<int, float> >> adj;
    int V;
    int E;

    Grafo()
    {
        char data[100];
        ifstream infile("facebook_santiago.net");

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
};
