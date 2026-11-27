public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        int idProduto;

        System.out.println("Bem vindo ao nosso sistema de compras! \n(Digite a opção que deseja comprar)");

        do {
            idProduto = Interface.criarMenu("Opções:",
                    "Tv LG 50 polegadas " +
                            "-Rádio Automotivo Bluetooth " +
                            "-Playstation 5 1Tb " +
                            "-Tablet Samsung Galaxy " +
                            "-Celular MotoG 47 " +
                            "-Finalizar compra -");
            if (idProduto == 6) {
                break;
            }

            int quantidade = Interface.selecionarQuantidade();

            if (idProduto < 6) {
                carrinho.addProdutos(idProduto, quantidade);
            }
        }while (idProduto < 6);

        carrinho.listarProdutos();

        carrinho.calcularPreco();
    }
}