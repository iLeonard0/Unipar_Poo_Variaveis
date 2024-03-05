// Atividade 2
// Faca um sistema que peca 2 valores e faca uma subtracao.

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double valorUm = 0.0;
        double valorDois = 0.0;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o valor 1: ");
        valorUm = scanner.nextDouble();
        
        System.out.println("Digite o valor 2: ");
        valorDois = scanner.nextDouble();       
        
        double somaNumeros = valorUm - valorDois;
        
        System.out.println("A subtracao dos valores e: " + somaNumeros);
        
    }
}
