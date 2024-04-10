/* Crie um Objeto chamado Carro, definina quais são as suas caracteristicas e metodos e crie
uma outra classe Chamada CarroTeste para criar o objeto e testar.
 */

package br.unipar.objetos;

public class Carro {
    public String marca;
    public String descricao;
    public double valor;

    public Carro(String marca, String descricao){
        this.marca = marca;
        this.descricao = descricao;
    }
    public Carro(String marca){
        this.marca = marca;
    }
    public Carro(double valorCivic){
        this.valor = valorCivic;
    }




}
