package CarroV4;

class ListadorFiltro implements Listador {
  private Filtro f;
  ListadorFiltro(Filtro f) {
     this.f = f;
  }
  public void carro(String marca, String modelo,
              String cor, int ano, int preco) {
     if(f.passou(ano)) {
       System.out.println(marca +"/"+ modelo +"/"+ ano +" = "+ preco);
     }
  }
}//
