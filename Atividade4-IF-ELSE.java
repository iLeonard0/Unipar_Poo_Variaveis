// Atividade 4. (IF and ELSE)
// Verificacao de maior numero: Escreva um programa Java que solicita ao usuario inserir dois numeros inteiros. O programa deve entao determinar qual dos dois numeros e o maior e imprimir essa informacao.

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite seu segundo numero: ");
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("O numero " + numeroUm + " (Primeiro Numero) e maior que " + numeroDois + " (Segundo Numero)");
        } else if (numeroDois > numeroUm) {
            System.out.println("O numero " + numeroDois + " (Segundo Numero) e maior que " + numeroUm + " (Primeiro Numero)");
          }  else if(numeroUm == numeroDois) {
                System.out.println("Os dois numeros tem o mesmo valor.");
        }
    }
}
