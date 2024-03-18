import java.util.Scanner;

class Pilha {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int cont = 0;
        int x;
        String pilha[] = new String[6];
        int resp;

        do{
            System.out.println("Digite a opcao:");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Topo da Pilha");
            System.out.println("4 - Listar Pilha");
            System.out.println("5 - Sair");
            resp = scanner.nextInt();

            switch (resp) {
                case 1:
                    if(cont<5){
                        ++cont;
                        System.out.println("Digite o conteudo do elemento " + cont + ":");
                        scanner.nextLine();
                        pilha[cont] = scanner.nextLine();
                    }
                    else{
                        System.out.println("A pilha esta cheia.");
                        scanner.nextLine();
                    }
                    System.out.println("Pressione Enter.");
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 2:
                    if(cont>0){
                        --cont;
                        System.out.println("Elemento retirado da pilha.");
                    }
                    else{
                        System.out.println("Pilha vazia.");
                    }
                    System.out.println("Pressione Enter.");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 3:
                    if(cont>0){
                        System.out.println("Elemento no topo da pilha (Posicao " + cont + "): " + pilha[cont]);
                    }
                    else{
                        System.out.println("Pilha vazia.");
                    }
                    System.out.println("Pressione Enter.");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 4:
                    if(cont>0){
                        for (x=1; x<=cont; x++) {
                            System.out.println("Posicao " + (cont+1-x) + ": " + pilha[cont+1-x]);
                        }
                    }
                    else{
                        System.out.println("Pilha vazia.");
                    }
                    System.out.println("Pressione Enter.");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    System.out.println("Pressione Enter.");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
            }

        }while (resp != 5);
        scanner.close();
    }
}
