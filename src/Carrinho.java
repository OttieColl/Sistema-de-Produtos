import produtos.*;
import java.util.ArrayList;
import java.util.List;

public final class Carrinho {
    private final List<Produtos> produtos = new ArrayList<>();

    public Carrinho() {
    }

    public void addProdutos(int id, int quantidade) {
        boolean produtoInvalido = false;
        switch (id) {
            case 1:
                produtos.add(new Televisao("Tv LG 50 polegadas", 1399.00, quantidade));
                break;
            case 2:
                produtos.add(new Radio("Rádio Automotivo Bluetooth", 122.00, quantidade));
                break;
            case 3:
                produtos.add(new Videogame("Playstation 5 1Tb", 4499.00, quantidade));
                break;
            case 4:
                produtos.add(new Tablet("Tablet Samsung Galaxy", 999.00, quantidade));
                break;
            case 5:
                produtos.add(new Celular("Celular MotoG 47", 1365.00, quantidade));
                break;
            default:
                System.out.println("Opção inválida! Por favor tente novamente.");
                produtoInvalido = true;
                break;
        }
        if (!produtoInvalido)
            System.out.println("Produto adicionado ao carrinho.");
    }

     public void listarProdutos(){
         System.out.println("Seu carrinho:");
        for (Produtos produto : produtos) {
            System.out.println(produto.getNome() + " - " + produto.getQuantidade() + "x");
        }
     }

     public void calcularPreco(){
        double precoTotal = 0;
        for (Produtos produto : produtos) {
            precoTotal += produto.getPreco() * produto.getQuantidade();
        }
        System.out.println("\nPreço total do carrinho: R$" + String.format("%.2f", precoTotal));
     }
}