// Atividade 4
// Faca um sistema que peca 4 notas divida por 4;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double notaUm = 0.0;
        double notaDois = 0.0;
        double notaTres = 0.0;
        double notaQuatro = 0.0;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Digite a nota 1: ");
        notaUm = scanner.nextDouble();
        
        System.out.println ("Digite a nota 2: ");
        notaDois = scanner.nextDouble(); 

        System.out.println ("Digite a nota 3: ");
        notaTres = scanner.nextDouble();       
        
        System.out.println ("Digite a nota 4: ");
        notaQuatro = scanner.nextDouble();               
        
        double somaNotas = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        
        System.out.println("Sua nota final (media) sera: " + somaNotas);
        
    }
}
