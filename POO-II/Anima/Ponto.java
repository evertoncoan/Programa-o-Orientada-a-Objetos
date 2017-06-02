package Anima;

import static java.lang.Math.*;

class Ponto {
  private int x,y;
  Ponto() {
    this(0,0);
  }
  Ponto(int x0, int y0) {
    x = x0; y = y0;
  }
  Ponto(int z) {
    this(z,z);
  }
  void deslocarX(int val) {
    x = x + val;
  }
  void deslocarY(int val) {
    y = y + val;
  }
  int normaX(Ponto q) {
    //return (int) abs(this.x - q.x);
    int norma;
    norma = this.x - q.x;
    if(norma < 0) norma = -norma;
    return norma;
  }
  int normaY(Ponto q) {
    int norma;
    norma = this.y - q.y;
    if(norma < 0) norma = -norma;
    return norma;
  }
  int x0(Ponto q) {
     int
       x1 =  this.x,
       x2 =  q.x;
     return min(x1,x2);
  }
  int y0(Ponto q) {//codigo alternativo
    int y0 = this.y;
    if(q.y < y0) y0 = q.y;
    return y0;
  }

  double norma(Ponto q) {
    return sqrt( pow(normaX(q),2) + pow(normaY(q),2));
  }

  public String toString() {
    return "("+ x +","+ y +")";
  }
  
  
}
