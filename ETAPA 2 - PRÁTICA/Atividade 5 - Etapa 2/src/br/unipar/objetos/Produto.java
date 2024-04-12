/*
5 - **Exercício para Praticar Múltiplos Construtores em Java:**

Crie uma classe **`Produto`** que representará um produto em uma loja. Essa classe deve conter os
seguintes atributos privados:

- Nome (do tipo String)
- Preço (do tipo double)
- Quantidade em Estoque (do tipo int)

Implemente múltiplos métodos construtores na classe **`Produto`** para permitir diferentes
maneiras de inicializar um objeto **`Produto`**. Os métodos construtores devem ser os seguintes:

1. Um construtor que aceita apenas o nome do produto e inicializa os demais atributos com
valores padrão (preço = 0.0 e quantidade em estoque = 0).

2. Um construtor que aceita o nome e o preço do produto, inicializando a quantidade em
estoque com o valor padrão (0).

3. Um construtor que aceita o nome, o preço e a quantidade em estoque do produto.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário
criar objetos dessa classe utilizando os diferentes construtores implementados e exibir as
características dos produtos criados.

Certifique-se de que os métodos construtores estão sendo utilizados corretamente para inicializar
os objetos da classe **`Produto`** com os valores fornecidos pelo usuário.
 */

package br.unipar.objetos;

public class Produto {

    private final String nome;
    private final double preco;
    private final int quantEstoque;

    public Produto(String nome){
        this.nome = nome;
        this.preco = 0.0;
        this.quantEstoque = 0;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = 0;
    }

    public Produto(String nome, double preco, int quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }


}
