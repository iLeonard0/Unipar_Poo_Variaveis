/*
Desenvolva uma classe em Java para representar um objeto do tipo Produto. Essa classe deve possuir
atributos privados para armazenar o nome, o preço e a quantidade em estoque do produto. Implemente
métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.

Após criar a classe Produto, crie objetos dessa classe e teste os métodos implementados, modificando
e exibindo as informações dos produtos criados.

Certifique-se de utilizar o encapsulamento de forma correta, protegendo os atributos da classe e garantindo
o acesso seguro a eles através dos métodos públicos disponibilizados.
 */

package br.unipar.objetos;

    public class Produto {
        private String nome;
        private double preco;
        private int QuantEstoque;


        // Métodos para acessar os atributos
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEmEstoque() {
            return QuantEstoque;
        }

        // Métodos para modificar os atributos
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void setQuantEstoque(int QuantEstoque) {
            this.QuantEstoque = QuantEstoque;
        }

        // Método para exibir informações do produto
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$" + preco);
            System.out.println("Quantidade em estoque: " + QuantEstoque);
        }

        // Adicionar quantidade ao estoque
        public void adicionarQuantidadeEstoque(int quantidade) {
            QuantEstoque += quantidade;
        }

        // Remover quantidade do estoque
        public void removerQuantidadeEstoque(int quantidade) {
            if (QuantEstoque >= quantidade) {
                QuantEstoque -= quantidade;
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        }
}
