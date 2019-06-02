#include <bits/stdc++.h>
#include "grafo.hpp"
#include "grafo_dirigido.hpp"
using namespace std;

int main()
{
    GrafoDirigido gd1("dirigido2.net");
    cout << "Componentes Fortemente Conexas" << endl;
    gd1.componentesFortementeConexas();
    cout << endl;

    GrafoDirigido gd2("tcc_completo.net");
    cout << "Ordenação Topológica" << endl;
    gd2.dfsOrdenacaoTopologica();
    cout << endl;

    Grafo g("fln_pequena.net");
    cout << "Prim" << endl;
    g.prim();

    return 0;
}

// g++ -o main *.cpp -std=c++11
// g++ -o main main.cpp -std=c++11
