class Main {

  public static void main(String[] args) {
    Revendedora lojine;
    lojine = new Revendedora();
    lojine.listarTodos(); System.out.println("\n");
 
    Carro x1,x2,x3;
    lojine.addCarro(x1 = new Carro("asas","sasa","asa",2001,1));
    lojine.addCarro(x2 = new Carro("asas","sasa","asa",2002,2));
    lojine.addCarro(x3 = new Carro("asas","sasa","asa",2003,3));
    lojine.listarTodos(); System.out.println("\n");

   
    lojine.removeCarro(x1);
    lojine.removeCarro(x2);
    lojine.listarTodos(); System.out.println("\n");
   
    lojine.addCarro(x2);
    lojine.addCarro(x1);
    lojine.listarTodos(); System.out.println("\n");


  }

}//
