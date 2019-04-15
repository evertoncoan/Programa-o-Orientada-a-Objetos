#include <bits/stdc++.h>
#include "grafo.hpp"
using namespace std;

int main()
{
    Grafo g;

    //g.imprimirGrafo();
    cout << "Quantidade de vértices = " << g.qtdVertices() << endl;
    cout << "Quantidade de arestas = " << g.qtdArestas() << endl;
    cout << "Grau do vértice 33 = " << g.grau(33) << endl;
    cout << "Rótulo do vértice 6 = " << g.rotulo(6) << endl;

    cout << "Vizinhos do 33: ";
    for (auto i : g.vizinhos(33))
        cout << i << " ";
    cout << endl;

    int u = 34;
    int v = 21;
    if (g.haAresta(u, v))
    {
        cout << "Há aresta entre " << u << " e " << v << endl;
    } else {
        cout << "Não há aresta entre " << u << " e " << v << endl;
    }

    cout << "Peso da aresta que liga o vérice " << u << " ao " << v
         << " é = " << g.peso(u,v) << endl;

    return 0;
}

// g++ -o main *.cpp -std=c++11
// g++ -o main main.cpp -std=c++11
