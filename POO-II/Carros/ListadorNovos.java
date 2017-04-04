package Carros;

class ListadorNovos implements Listador {
  private int x;
  ListadorNovos(int x) {
     this.x = x;
  }
  public void carro(String marca, String modelo,
              String cor, int ano, int preco) {
     if(ano >= x) {
       System.out.println(marca +"/"+ modelo +"/"+ ano +" = "+ preco);
     }
  }
}//
