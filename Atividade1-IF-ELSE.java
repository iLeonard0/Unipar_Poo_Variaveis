// Atividade 1. (IF and ELSE)
// Escreva um programa Java que pede ao usuario para inserir sua idade. O programa deve entao verificar se a idade e maior ou igual a 18. Se for, deve imprimir "Voce e maior de idade". Caso contrario, deve imprimir "Voce e menor de idade".

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double idade = 0.0;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Digite sua idade: ");
        idade = scanner.nextDouble();
        
        if (idade >= 18) {
            System.out.println("Voce e maior de idade");
        } else if (idade < 18 && idade > 0) {
            System.out.println("Voce e menor de idade");
    }
}
}
