package Carros;

class ListadorTodos implements Listador {
   
  public void carro(String marca, String modelo, String cor, int ano, int preco) {
      System.out.println(marca +"/"+ modelo +"/"+ ano +" = "+ preco);
  }
}//
