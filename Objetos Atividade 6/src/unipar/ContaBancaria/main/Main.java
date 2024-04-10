    /* 6. Crie uma classe Java chamada ContaBancaria que represente uma conta bancária simples.
A classe deve ter os seguintes atributos privados:

    - saldo, do tipo double, representando o saldo atual da conta.

    - numeroConta, do tipo String, representando o número da conta bancária.

    A classe ContaBancaria deve ter os seguintes métodos públicos:

    - Um método chamado depositar(double valor) que recebe um valor como parâmetro e adiciona esse
    valor ao saldo da conta.

    - Um método chamado sacar(double valor) que recebe um valor como parâmetro e subtrai esse valor do
    saldo da conta, desde que haja saldo suficiente. Caso contrário, deve exibir uma mensagem de erro.

    - Um método chamado consultarSaldo() que retorna o saldo atual da conta.
 */

    package unipar.ContaBancaria.main;
    import unipar.ContaBancaria.Objetos.Objetos;
    import java.util.Objects;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char continuar;
            double depositar;
            double sacar;
            String nConta;
            double valorFinal;

            // Movendo a criação do objeto fora do loop
            Objetos contaBancaria = new Objetos();
            contaBancaria.setSaldo(2500.55);
            contaBancaria.setNumeroConta("28762");

            do {
                System.out.println(" ");
                System.out.println("Conta Bancária:");
                System.out.println("1 - Consultar Saldo e número da conta");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println(" ");
                System.out.print("Digite sua opção: ");
                int opcao = scanner.nextInt();

                if (opcao == 1) {
                    System.out.println(" ");
                    System.out.println("O saldo de sua conta é: " + contaBancaria.getSaldo());
                    System.out.println("O número da sua conta é: " + contaBancaria.getNumeroConta());
                    System.out.println(" ");
                }

                if (opcao == 2) {
                    System.out.print("Digite o número da conta que deseja depositar: ");
                    nConta = scanner.next();
                    if (Objects.equals(nConta, contaBancaria.getNumeroConta())) {
                        System.out.print("Digite o valor que você quer depositar: ");
                        depositar = scanner.nextDouble();
                        valorFinal = depositar + contaBancaria.getSaldo();
                        contaBancaria.setSaldo(valorFinal); // Atualizar o saldo após o depósito
                        System.out.println("Seu saldo agora é de: R$ " + contaBancaria.getSaldo());
                    } else {
                        System.out.println("Número da conta incorreto, TENTE NOVAMENTE!");
                    }
                }

                if (opcao == 3) {
                    System.out.print("Digite o número da conta que deseja sacar: ");
                    nConta = scanner.next();
                    if (Objects.equals(nConta, contaBancaria.getNumeroConta())) {
                        System.out.print("Digite o valor que deseja sacar: ");
                        sacar = scanner.nextDouble();
                        if (sacar <= contaBancaria.getSaldo()) {
                            double ValorPosSaque = contaBancaria.getSaldo() - sacar;
                            contaBancaria.setSaldo(ValorPosSaque); // Atualizar o saldo após o saque
                            System.out.println("Você acaba de sacar " + sacar + " e agora você tem um total de" +
                                    " R$ " + contaBancaria.getSaldo());
                        } else {
                            System.out.println("Saldo insuficiente. Não foi possível realizar o saque.");
                        }
                    } else {
                        System.out.println("Número da conta incorreto, TENTE NOVAMENTE!");
                    }
                }

                System.out.println("Deseja continuar? s/n");
                continuar = scanner.next().charAt(0);

            } while (continuar == 's' || continuar == 'S');
            System.out.println(" ");
            System.out.println(" ---------------------");
            System.out.println("| PROGRAMA ENCERRADO  |");
            System.out.println(" ---------------------");
        }
    }