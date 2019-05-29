#include <bits/stdc++.h>
#include "grafo.hpp"
#include "grafo_dirigido.hpp"
using namespace std;

int main()
{
    GrafoDirigido gd("dirigido1.net");

    gd.imprimirGrafo();
    cout << "Quantidade de vértices = " << gd.qtdVertices() << endl;
    cout << "Quantidade de arestas = " << gd.qtdArestas() << endl;
    cout << "Grau do vértice 2 = " << gd.grau(2) << endl;
    cout << "Rótulo do vértice 2 = " << gd.rotulo(2) << endl;

    int u = 3;
    int v = 6;
    if (gd.haAresta(u, v))
    {
        cout << "Há aresta entre " << u << " e " << v << endl;
    } else {
        cout << "Não há aresta entre " << u << " e " << v << endl;
    }

    gd.componentesFortementeConexas();

    /*Grafo g("fln_pequena.net");

    //g.imprimirGrafo();
    cout << "Quantidade de vértices = " << g.qtdVertices() << endl;
    cout << "Quantidade de arestas = " << g.qtdArestas() << endl;
    cout << "Grau do vértice 2 = " << g.grau(2) << endl;
    cout << "Rótulo do vértice 2 = " << g.rotulo(2) << endl;

    cout << "Vizinhos do 2: ";
    for (auto i : g.vizinhos(2))
        cout << i << " ";
    cout << endl;

    int u = 2;
    int v = 10;
    if (g.haAresta(u, v))
    {
        cout << "Há aresta entre " << u << " e " << v << endl;
    } else {
        cout << "Não há aresta entre " << u << " e " << v << endl;
    }

    cout << "Peso da aresta que liga o vérice " << u << " ao " << v
         << " é = " << g.peso(u,v) << endl;

    cout << "\nBuscas" << endl;
    g.buscas(2);
    cout << "\nDijkstra" << endl;
    g.dijkstra(2);

    cout << "\nFloyd-Warshall" << endl;
    g.floydWarshall();*/

    return 0;
}

// g++ -o main *.cpp -std=c++11
// g++ -o main main.cpp -std=c++11
