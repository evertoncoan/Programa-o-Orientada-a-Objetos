package CirculoV2;

class Circulo extends Ponto {//Circulo <: Ponto
  private int r;
  double area() {
   return 3.14 * r * r;
  }

  int x0() {
     return this.normaX(new Ponto(r,r));
  }
  int y0() {
     return this.normaY(new Ponto(r,r));
  }
  
  int diametro() { return 2 * r;}

}//
