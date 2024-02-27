// ATIVIDADE 5 - DADOS EM JAVA

public class ControleEstoque {
    public static void main(String[] args) {
        // Declarar variaveis para produtos
        String nomeIphone, nomeLaptop, nomeFone;
        String marcaIphone, marcaLaptop, marcaFone;
        double precoIphone, precoLaptop, precoFone;
        int quantidadeIphone, quantidadeLaptop, quantidadeFone; 

        // Inicializar os dados para cada produto 
        nomeIphone = "Iphone 15 Pro";
        marcaIphone = "Apple";
        precoIphone = 5500.99;
        quantidadeIphone = 50;

        nomeLaptop = "Lenovo Gaming i3";
        marcaLaptop = "Lenovo";
        precoLaptop = 4400.99;
        quantidadeLaptop = 30;

        nomeFone = "Haylou GT7";
        marcaFone = "Xiaomi";
        precoFone = 119.99;
        quantidadeFone = 100; 

        // Exibir dados de produtos cadastrados anteriormente
        System.out.println("Dados do Smartphone:");
        System.out.println("Nome: " + nomeIphone);
        System.out.println("Marca: " + marcaIphone);
        System.out.println("Preco: R$" + precoIphone);
        System.out.println("Quantidade em estoque: " + quantidadeIphone);
        System.out.println();

        System.out.println("Dados do Laptop:");
        System.out.println("Nome: " + nomeLaptop);
        System.out.println("Marca: " + marcaLaptop);
        System.out.println("Preco: R$" + precoLaptop);
        System.out.println("Quantidade em estoque: " + quantidadeLaptop);
        System.out.println();

        System.out.println("Dados do Fone de Ouvido Bluetooth:");
        System.out.println("Nome: " + nomeFone);
        System.out.println("Marca: " + marcaFone);
        System.out.println("Preco: R$" + precoFone);
        System.out.println("Quantidade em estoque: " + quantidadeFone);
    }
}
