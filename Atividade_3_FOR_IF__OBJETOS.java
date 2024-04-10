/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

import java.util.Scanner;

public class ATIVIDADE_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade em anos: ");
        int idadeAnos = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int idadeMeses = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int idadeDias = scanner.nextInt();

        int SomaDeDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;

        System.out.println("Você tem: " + idadeAnos + " anos, " + idadeMeses + " meses, " + idadeDias + " dias " +
                " = " + SomaDeDias + " dias!"  );

    }
}
