package javacore.aleatorios;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean diminuirEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Estoque atualizado: "+estoque);
            return true;
        }
        System.out.println("Estoque insuficiente");
        return false;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }
}

class CarrinhoDeCompras {
    private Produto[] produtos;
    private int[] quantidades;
    private int totalItens;

    public CarrinhoDeCompras(int capacidade) {
        this.produtos = new Produto[capacidade];
        this.quantidades = new int[capacidade];
        this.totalItens = 0;
    }

    public void adicionarProduto(Produto p, int qtd) {
        if (totalItens < produtos.length) {
            produtos[totalItens] = p;
            quantidades[totalItens] = qtd;
            totalItens++;
        } else {
        System.out.println("Carrinho cheio");
        }
    }


    public double calcularTotal() {
        // FALTA: somar o valor total do carrinho
        // (preço * quantidade de cada produto)
        double soma = 0;
        if (totalItens <= 0){
            return 0;
        }
        for (int i = 0; i < totalItens; i++) {
            soma += produtos[i].getPreco() * quantidades[i];
        }

        return soma;
    }

    public void listar() {
        System.out.println("=== CARRINHO ===");
        for (int i = 0; i < totalItens; i++) {
            System.out.println(produtos[i].getNome() + " x" + quantidades[i]);
        }
    }

    static void main(String[] args) {
        Produto produto = new Produto("Mouse", 199.90, 100);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(10);

        produto.diminuirEstoque(10);
        System.out.println(produto.getEstoque());
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());

        carrinho.adicionarProduto(produto, 4);
        System.out.println(carrinho.calcularTotal());
        carrinho.listar();


    }
}

