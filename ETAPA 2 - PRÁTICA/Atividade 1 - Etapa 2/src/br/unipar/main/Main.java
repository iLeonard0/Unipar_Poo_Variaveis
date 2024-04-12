/*
1 - Você deve criar uma classe em Java para representar um carro. A classe deve conter atributos privados para
armazenar a marca, o modelo, o ano e a cor do carro. Além disso, você deve implementar métodos públicos para
acessar e modificar esses atributos, garantindo o encapsulamento da classe. Por fim, crie um método para exibir
as informações do carro.

Após criar a classe, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as
informações dos carros criados.

Lembre-se de utilizar o encapsulamento adequado para proteger os atributos da classe e garantir o acesso seguro a
os mesmos através dos métodos públicos.
 */

package br.unipar.main;

import br.unipar.objetos.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println(" ");
        carro1.setMarca("Hyundai");
        carro1.setModelo("HB20");
        carro1.setAno(2016);
        carro1.setCor("Prata");

        carro2.setMarca("Honda");
        carro2.setModelo("CIVIC");
        carro2.setAno(2022);
        carro2.setCor("Branco");

        System.out.println("CARRO 1:");
        carro1.InformacoesCarro();
        System.out.println(" ");
        System.out.println("CARRO 2:");
        carro2.InformacoesCarro();

        // Modificando Atributos dos carros

        carro1.setMarca("Chevrolet");
        carro1.setModelo("Onix");
        carro1.setAno(2005);
        carro1.setCor("Azul");

        carro2.setMarca("Renault");
        carro2.setModelo("Kangoo");
        carro2.setAno(2008);
        carro2.setCor("Branco");

        System.out.println(" ");
        System.out.println("CARRO 1 (Após modificações):");
        carro1.InformacoesCarro();
        System.out.println(" ");
        System.out.println("CARRO 2 (Após modificações):");
        carro2.InformacoesCarro();

    }
}
