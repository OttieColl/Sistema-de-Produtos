package produtos;

public abstract class Produtos {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Produtos( String nome, double preco, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}