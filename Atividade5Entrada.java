// Atividade 5
// Faca um sistema que o usuario vai informar 2 numeros e o sistema deve retornar a soma, subtracao, divisao e multiplicacao dos dois numeros.

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double numeroUm = 0.0;
        double numeroDois = 0.0;
        
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Digite o numero 1: ");
        numeroUm = scanner.nextDouble();
        
        System.out.println ("Digite o numero 2: ");
        numeroDois = scanner.nextDouble(); 

        
        double somaNumero = numeroUm + numeroDois;
        double subtracaoNumero = numeroUm - numeroDois;
        double multiplicacaoNumero = numeroUm * numeroDois;
        double divisaoNumero = numeroUm / numeroDois;
        
        System.out.println(" ");
        System.out.println("A soma dos numeros escolhidos e: " + somaNumero);
        System.out.println("A subtracao dos numeros escolhidos e: " + subtracaoNumero);   
        System.out.println("A multiplicacao dos numeros escolhidos e: " + multiplicacaoNumero);
        System.out.println("A divisao dos numeros escolhidos e: " + divisaoNumero);
        
    }
}
