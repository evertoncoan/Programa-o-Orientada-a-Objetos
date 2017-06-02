package CarroV4;

class Carro {
  private String marca, modelo, cor;
  private int ano, preco;

  Carro(String marca, String modelo, String cor, int ano, int preco) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.ano = ano;
    this.preco = preco;
  }

  void imprimir(Listador v) {
    v.carro(marca, modelo, cor, ano, preco);
  }

}//
