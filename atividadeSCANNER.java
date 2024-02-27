import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados:  ");
        
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        idade = scanner.nextInt();
        
        System.out.print("Peso: ");
        peso = scanner.nextDouble();
        scanner.close();
        
        System.out.println("");
        System.out.println("Os dados cadastrados foram: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: "+ peso);
    }
}
