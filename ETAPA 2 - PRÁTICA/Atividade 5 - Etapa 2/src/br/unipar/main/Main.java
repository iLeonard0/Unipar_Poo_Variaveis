/*
5 - **Exercício para Praticar Múltiplos Construtores em Java:**

Crie uma classe **`Produto`** que representará um produto em uma loja. Essa classe deve conter os
seguintes atributos privados:

- Nome (do tipo String)
- Preço (do tipo double)
- Quantidade em Estoque (do tipo int)

Implemente múltiplos métodos construtores na classe **`Produto`** para permitir diferentes
maneiras de inicializar um objeto **`Produto`**. Os métodos construtores devem ser os seguintes:

1. Um construtor que aceita apenas o nome do produto e inicializa os demais atributos com
valores padrão (preço = 0.0 e quantidade em estoque = 0).

2. Um construtor que aceita o nome e o preço do produto, inicializando a quantidade em
estoque com o valor padrão (0).

3. Um construtor que aceita o nome, o preço e a quantidade em estoque do produto.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário
criar objetos dessa classe utilizando os diferentes construtores implementados e exibir as
características dos produtos criados.

Certifique-se de que os métodos construtores estão sendo utilizados corretamente para inicializar
os objetos da classe **`Produto`** com os valores fornecidos pelo usuário.
 */

package br.unipar.main;
import br.unipar.objetos.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de objeto (Produto) com o 1º construtor;
        Produto produto1 = new Produto("Produto A");
        System.out.println("Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQuantEstoque());
        System.out.println(" ");

        // Criação de objeto (Produto) com o 2º construtor;

        System.out.print("Digite o nome do Produto B: ");
        String nomeProdutoB = scanner.nextLine();
        System.out.print("Digite o preço do Produto B: ");
        double precoProdutoB = scanner.nextDouble();
        Produto produto2 = new Produto(nomeProdutoB, precoProdutoB);
        System.out.println();
        System.out.println("Produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Quantidade em estoque: " + produto2.getQuantEstoque());
        System.out.println();

        // Criação de obejto (Produto) com o 3º construtor;

        System.out.print("Digite o nome do Produto C: ");
        scanner.nextLine();
        String nomeProdutoC = scanner.next();
        System.out.print("Digite o preço do Produto C: ");
        double precoProdutoC = scanner.nextDouble();
        System.out.print("Digite a quantidade de estoque do Produto C: ");
        int estoqueProdutoC = scanner.nextInt();
        Produto produto3 = new Produto(nomeProdutoC, precoProdutoC, estoqueProdutoC);
        System.out.println();
        System.out.println("Produto 3:");
        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Preço: " + produto3.getPreco());
        System.out.println("Quantidade em estoque: " + produto3.getQuantEstoque());

        scanner.close();
    }
}
