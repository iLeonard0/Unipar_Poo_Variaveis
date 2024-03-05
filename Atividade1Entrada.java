// Atividade 1
// 1. Faca um sistema que peca 3 valores some os 3 e mostre o total;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double valorUm = 0.0;
        double valorDois = 0.0;
        double valorTres = 0.0;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o valor 1: ");
        valorUm = scanner.nextDouble();
        
        System.out.println("Digite o valor 2: ");
        valorDois = scanner.nextDouble();       

        System.out.println("Digite o valor 3: ");
        valorTres = scanner.nextDouble();
        
        double somaNumeros = valorUm + valorDois + valorTres;
        
        System.out.println("O valor total e: " + somaNumeros);
        
    }
}
