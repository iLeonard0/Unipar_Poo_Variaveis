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

package br.unipar.Objetos;

public class Circulo {
    private double raio;
    private String cor;

    // Construtor da classe Circulo
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    // Métodos para acessar e modificar o raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Métodos para acessar e modificar a cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}