/*
2. Programa em Java dos patinhos da Xuxa -
    Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:
    *n patinhos foram passearAlém das montanhas Para brincar A mamãe gritou: Quá, quá, quá, quá*
    *Mas só n-1 patinhos voltaram de lá*

    Que se repete até nenhum patinho voltar de lá.
    Ao final, todos os patinhos voltam:

    A mamãe patinha foi procurarAlém das montanhasNa beira do marA mamãe gritou:
    Quá, quá, quá, quáE os n patinhos voltaram de lá.

    Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela,
    onde o inteiro recebido representa o número inicial "n" de patinhos que foram passear.
 */

import java.util.Scanner;

public class ATIVIDADE_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Patinhos da XUXA");
        System.out.println("----------------");
        System.out.print("Digite o número de patinhos: ");
        int patinhos = scanner.nextInt();

        for (int i = patinhos; i > 0; i--) {
            System.out.println(i + " patinho(s) foram passear. Além das montanhas para brincar a " +
                    "mamãe gritou: Quá, Quá, Quá, Quá mas só " + (i-1) + " voltaram de lá");
        }
        System.out.println(" ");
        System.out.println("A mamãe patinha foi procurar. Além das montanhas. Na beira do mar. " +
                "A mamãe gritou: " + "Quá, quá, quá, quá. E os " + patinhos +  " patinhos voltaram de lá." );
    }

}
