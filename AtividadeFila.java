import java.util.Scanner;

class Fila {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int cont = 0;
        int x;
        String fila[] = new String[6];
        int resp;

        do{
            System.out.println("Digite a opção:");
            System.out.println("1-Adicionar à fila");
            System.out.println("2-Retirar da fila");
            System.out.println("3-Primeiro da fila");
            System.out.println("4-Exibir fila");
            System.out.println("5-Sair");
            resp = scanner.nextInt();

            switch (resp) {
                case 1:
                    if(cont<5){
                        ++cont;
                        System.out.println("Digite o conteudo do elemento " + cont + ":");
                        scanner.nextLine();
                        fila[cont] = scanner.nextLine();
                    }
                    else{
                        System.out.println("A fila esta cheia");
                        scanner.nextLine();
                    }
                    System.out.println("Pressione Enter");
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 2:
                    if(cont>0){
                        --cont;
                        for(x=1;x<=cont;x++){
                            fila[x]=fila[x+1];
                        }
                        System.out.println("Elemento retirado da fila.");
                    }
                    else{
                        System.out.println("Fila vazia");
                    }
                    System.out.println("Pressione Enter");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 3:
                    if(cont>0){
                        System.out.println("Elemento mais à frente na fila: " + fila[1]);
                    }
                    else{
                        System.out.println("Fila vazia");
                    }
                    System.out.println("Pressione Enter");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 4:
                    if(cont>0){
                        System.out.println("Elementos da fila: ");
                        for(x=1;x<=cont;x++) {
                            System.out.print(x + "º: '" + fila[x] + "'");
                            if(cont>=2 && x<cont){ System.out.print(", ");}
                        }
                        System.out.print(".");
                    }
                    else{
                        System.out.println("Fila vazia");
                    }
                    System.out.println();
                    System.out.println("Pressione Enter");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    System.out.println("Pressione Enter");
                    scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
            }

        }while (resp != 5);
        scanner.close();
    }
}
