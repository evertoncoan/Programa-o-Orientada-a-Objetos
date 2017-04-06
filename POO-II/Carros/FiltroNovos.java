package Carros;

class FiltroNovos implements Filtro {
  private int x;
  FiltroNovos(int x) {
     this.x = x;
  }
  public boolean passou(int ano) {
     return ano >= x;
  }
}//
