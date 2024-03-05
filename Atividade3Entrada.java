// Atividade 3
// Faca um sistema que peca 2 notas para o usuario some as duas e divida por 2

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double notaUm = 0.0;
        double notaDois = 0.0;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Digite a nota 1: ");
        notaUm = scanner.nextDouble();
        
        System.out.println ("Digite a nota 2: ");
        notaDois = scanner.nextDouble();       
        
        double somaNotas = (notaUm + notaDois) / 2;
        
        System.out.println("Sua nota final sera: " + somaNotas);
        
    }
}
