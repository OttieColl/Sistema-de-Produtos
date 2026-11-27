import java.util.Scanner;

public class Interface {
    public static int criarMenu(String tituloMenu, String conteudoMenu) {
        //Cria um menu infinitamente escalável com titúlo. Utiliza Substrings para armazenar cada opção e a posição do símbolo "-" para separação do conteúdo.
        //A String conteudoMenu precisar terminar com "-" devido à lógica utilizada. Retorna a escolha do usuário.
        //Exemplo : int tipoQuarto = criarMenu("Tipo de quarto:", "Standard -Luxo -Presidencial -");
        Scanner input = new Scanner(System.in);
        //Variáveis
        int escolhaUsuario = 0;
        int contador;
        String conteudoMenuAux = conteudoMenu;
        do {
            conteudoMenu = conteudoMenuAux;
            contador = 0;
            String subString;
            int posicao;

            //Separa, ordena e imprime o conteúdo do Menu
            System.out.println(tituloMenu);
            while (true) {
                posicao = conteudoMenu.indexOf("-");
                if (conteudoMenu.isEmpty()) {
                    break;
                }
                subString = conteudoMenu.substring(0, posicao);
                System.out.println((contador + 1) + " - " + subString);

                conteudoMenu = conteudoMenu.substring(posicao + 1);
                contador++;
            }
            //Valida a escolha do usuário
            escolhaUsuario = input.nextInt();
            if (escolhaUsuario < 1 || escolhaUsuario > contador) {
                System.out.println("Opção inválida. Digite novamente.");
                escolhaUsuario = 0;
            }
        } while (escolhaUsuario < 1);
        return escolhaUsuario;
    }

    public static int selecionarQuantidade() {
        //Interface de escolha da quantidade de produtos.
        //Variáveis
        Scanner input = new Scanner(System.in);
        int quantidade;
        //Valida a escolha do usuário
        do {
            System.out.println("Digite a quantidade que deseja comprar: ");
            quantidade = input.nextInt();

            if (quantidade <=0)
                System.out.println("Quantidade invalida!");

        } while (quantidade <= 0);
        return quantidade;
    }
}