class Main {

  public static void main(String[] args) {
    Revendedora lojine;
    lojine = new Revendedora();


    Listador listaTodos, listaNovos, listaIntervalo;
    listaTodos = new ListadorTodos();
    listaNovos = new ListadorNovos(2002);
    listaIntervalo = new ListadorIntervalo(2000, 2008);
    

    lojine.listar(listaTodos); System.out.println("\n");
 
    Carro x1,x2,x3;
    lojine.addCarro(x1 = new Carro("asas","sasa","asa",2001,1));
    lojine.addCarro(x2 = new Carro("asas","sasa","asa",2002,2));
    lojine.addCarro(x3 = new Carro("asas","sasa","asa",2003,3));
    lojine.listar(listaTodos); System.out.println("\n");

    lojine.listar(listaNovos); System.out.println("\n");
   
    lojine.removeCarro(x1);
    lojine.removeCarro(x2);
    lojine.listar(listaTodos); System.out.println("\n");
   
    lojine.addCarro(x2);
    lojine.addCarro(x1);
    lojine.listar(listaTodos); System.out.println("\n");

    lojine.listar(listaIntervalo);
  }

}//
