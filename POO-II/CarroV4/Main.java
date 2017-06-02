package CarroV4;

class Main {

  public static void main(String[] args) {
    Revendedora lojine;
    lojine = new Revendedora();


    Listador listaTodos, listaNovos, listaIntervalo;
    listaTodos = new ListadorTodos();
    listaNovos = new ListadorNovos(2002);
    listaIntervalo = new ListadorIntervalo(2002,2008);
    

    lojine.listar(listaTodos); System.out.println("\n");
 
    Carro x1,x2,x3;
    lojine.addCarro(x1 = new Carro("asas","sasa","asa",2001,1));
    lojine.addCarro(x2 = new Carro("asas","sasa","asa",2002,2));
    lojine.addCarro(x3 = new Carro("asas","sasa","asa",2003,3));
    lojine.listar(listaTodos); System.out.println("\n");

    System.out.println("\nListadorNovos ...");
    lojine.listar(listaNovos); System.out.println("\n");

    System.out.println("\nListadorIntervalo ...");
    lojine.listar(listaIntervalo); System.out.println("\n");

   
    lojine.removeCarro(x1);
    lojine.removeCarro(x2);
    lojine.listar(listaTodos); System.out.println("\n");
   
    lojine.addCarro(x2);
    lojine.addCarro(x1);
    lojine.listar(listaTodos); System.out.println("\n");





    Listador listaFiltro;
    listaFiltro = new ListadorFiltro(new FiltroNovos(2002));
    System.out.println("\nListadorFiltro/novos ...");
    lojine.listar(listaFiltro); 

    listaFiltro = new ListadorFiltro(new FiltroTodos());
    System.out.println("\nListadorFiltro/todos ...");
    lojine.listar(listaFiltro); 

    //exercicio
    //listaFiltro = new ListadorFiltro(new FiltroIntervalo(2002,2008));
    //System.out.println("\nListadorFiltro/intervalo ...");
    //lojine.listar(listaFiltro); 


  }

}//
