/*
7. Crie uma classe Java chamada Produto que represente um produto em um sistema de estoque.
 A classe deve ter os seguintes atributos privados:

    - codigo, do tipo int, representando o código do produto.
    - descricao, do tipo String, representando a descrição do produto.
    - preco, do tipo double, representando o preço unitário do produto.
    - quantidadeEmEstoque, do tipo int, representando a quantidade disponível
    em estoque do produto.

    A classe Produto deve ter os seguintes métodos públicos:

    - Um construtor que recebe como parâmetros o código, a descrição, o preço e a quantidade
    inicial em estoque do produto.

    - Métodos de acesso (getters) para todos os atributos da classe.

    - Um método chamado adicionarEstoque(int quantidade) que recebe uma quantidade como
    parâmetro e adiciona essa quantidade ao estoque do produto.

    - Um método chamado removerEstoque(int quantidade) que recebe uma quantidade como
    parâmetro e remove essa quantidade do estoque do produto, desde que haja estoque suficiente.
    Caso contrário, deve exibir uma mensagem de erro.
 */


package unipar.produto.main;

import unipar.produto.objetos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        Produto produto = new Produto(1, "Notebook Lenovo, Intel i5 10th, GTX 1650.", 4950.99, 50);

        do {
            System.out.println(" ");
            System.out.println("Opções:");
            System.out.println("1 - Consultar Produto");
            System.out.println("2 - Adicionar Produto ao Estoque");
            System.out.println("3 - Remover Produto do Estoque");
            System.out.println(" ");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println(" ");
                System.out.println("PRODUTO:");
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
                System.out.println(" ");
            }

            if (opcao == 2) {
                System.out.print("Digite a quantidade a ser adicionada ao estoque: ");
                int quantidade = scanner.nextInt();
                produto.adicionarEstoque(quantidade);
                System.out.println("Estoque atualizado. Quantidade em estoque agora: " + produto.getQuantidadeEmEstoque());
                System.out.println(" ");

            }

            if (opcao == 3) {
                System.out.print("Digite a quantidade a ser removida do estoque: ");
                int quantidade = scanner.nextInt();
                produto.removerEstoque(quantidade);
                System.out.println("Estoque atualizado. Quantidade em estoque agora: " + produto.getQuantidadeEmEstoque());
                System.out.println(" ");

            }

            System.out.println("Deseja continuar? s/n");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');
        System.out.println(" ");
        System.out.println(" ---------------------");
        System.out.println("| PROGRAMA ENCERRADO  |");
        System.out.println(" ---------------------");
    }
}
