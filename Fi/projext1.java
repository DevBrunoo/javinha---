import java.util.Scanner;

public class TestadorDeProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie um array de produtos com um tamanho máximo especificado
        System.out.print("Insira o número máximo de produtos: ");
        int maxSize = getNumProducts(scanner); // Método para obter o número máximo de produtos
        Produto[] produtos = new Produto[maxSize];

        // Adicione produtos ao inventário
        addToInventory(produtos, scanner); // Método para adicionar produtos ao inventário

        // Exiba o inventário
        displayInventory(produtos); // Método para exibir o inventário
    }

    // Método para exibir o inventário
    public static void displayInventory(Produto[] produtos) {
        System.out.println("Inventário:");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].isActive()) {
                System.out.println("Produto " + i + ": " + produtos[i].getName());
                System.out.println("Quantidade em Estoque: " + produtos[i].getQuantity());
                System.out.println("Preço: $" + produtos[i].getPrice());
                System.out.println("--------------------------");
            }
        }
    }

    // Outros métodos como getNumProducts, addToInventory e outros devem ser implementados aqui

}
