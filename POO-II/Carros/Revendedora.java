

class Revendedora {
  private Carro[] acervo;
  int n = 0;  //proximo slot disponivel

  Revendedora() {
    acervo = new Carro[1000];
    acervo[0] = new Carro("Fiat","uno","prata",2008,12000);
    acervo[1] = new Carro("Ford","eco","prata",2010,25000);
    n = 2;
  }

  void addCarro(Carro x) {
    acervo[n] = x;
    n = n + 1;
  }

  void removeCarro(Carro x) { 
    removeCarro(indexOf(x));
  }
  private void removeCarro(int k) {
    if (k < 0) return;
    n = n - 1;
    acervo[k] = acervo[n];
    return;
  }
  private int indexOf(Carro x) {
    for(int i = 0; i < n; i++) {
      if(acervo[i] == x) return i;
    }
    return -1;
  }

  void listarTodos() {
    for(int i = 0; i < n; i++) {
      acervo[i].imprimir(
         new ListadorTodos()
      );
    }
  }
 
 void listarNovos() { 
 }

  
}//
