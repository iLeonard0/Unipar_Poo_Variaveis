/*
4 - **Exercício para Praticar Método Construtor em Java:**

Você deve criar uma classe **`Circulo`** que representará um círculo geométrico. Essa classe deve conter
os seguintes atributos privados:

- Raio (do tipo double)
- Cor (do tipo String)

Implemente um método construtor na classe **`Circulo`** que aceite dois parâmetros:
 o raio e a cor do círculo. O método construtor deve inicializar os atributos correspondentes
  com os valores fornecidos como parâmetros.

Após criar a classe **`Circulo`**, desenvolva um programa principal que permita ao
usuário criar objetos dessa classe e exibir suas características.

Certifique-se de que o método construtor está sendo utilizado corretamente para
inicializar os objetos da classe **`Circulo`** com os valores fornecidos pelo usuário.

Dica: Você pode incluir métodos adicionais na classe **`Circulo`** para calcular a
área ou o perímetro do círculo, se desejar.
 */

package br.unipar.main;

import br.unipar.Objetos.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);

        System.out.println("Características do círculo:");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        scanner.close();
    }
}
