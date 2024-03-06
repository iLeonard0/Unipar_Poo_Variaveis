// Atividade 6
// Faca um sistema que pergunte para o usuario o nome, preco de produto, apos isso pergunte qual o percentual de desconto, a saida precisa ser o nome do produto e o novo preco.

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 
        
        String nomeProduto;
        double precoProduto = 0.0;
        double percentualDesconto = 0.0;
        double novoPreco = 0.0;
        
        System.out.println ("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine();
        
        System.out.println ("Digite o preco do produto: ");
        precoProduto = scanner.nextDouble();
        
        System.out.println ("Digite o percentual de Desconto do produto: ");
        percentualDesconto = scanner.nextDouble(); 

        novoPreco = precoProduto - (precoProduto * (percentualDesconto  / 100));
        
        System.out.println(" ");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("O Novo preco do produto e: " + novoPreco);
 
    }
}
