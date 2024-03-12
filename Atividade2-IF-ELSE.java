// Atividade 2. (IF and ELSE)
// Verificacao de numero par ou impar. Escreva um programa Java que solicita ao usuario inserir um numero inteiro. O programa deve entao verificar se o numero e par ou impar e imprimir a mensagem correspondente.

import java.util.Scanner;

public class VerificarParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira um numero inteiro:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero inserido e par.");
        } else {
            System.out.println("O numero inserido e impar.");
        }

    }
}
