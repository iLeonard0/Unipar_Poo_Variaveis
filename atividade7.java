// ATIVIDADE 7 - AJUSTE DE CODIGO

public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;
        Boolean marcaProduto;
        
        nomeProduto = "Fone de Ouvido";
        precoProduto = 29.99;        
        quantidadeProduto = 10;
        marcaProduto = true;

        
        System.out.println("Dados do Produto: ");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Marca: " + marcaProduto);
        System.out.println("Preco: $" + precoProduto);
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
    }
}
