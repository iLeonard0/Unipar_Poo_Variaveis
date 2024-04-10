/* Crie um Objeto chamado Carro, definina quais são as suas caracteristicas e metodos e crie
uma outra classe Chamada CarroTeste para criar o objeto e testar.
 */

package br.unipar.main;
import br.unipar.objetos.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        System.out.println(" ");
        Carro c1 = new Carro("Honda Civic ","é um automóvel produzido pela Honda desde 1973. " +
                "Atualmente encontra-se em sua décima primeira geração tendo um motor 2.0 aspirado de" +
                " 143 cv!");
        System.out.println(c1.marca + c1.descricao);

        Carro c2 = new Carro(200000.00);
        System.out.println("O valor deste Civic 2023 é: R$ " + c2.valor);
    }
}
