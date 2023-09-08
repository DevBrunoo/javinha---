import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryApp {
    public static void main(String[] args) {
        // Passo 1: Solicitar o número de produtos
        int maxSize = -1; // Valor inicial para forçar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            while (maxSize <= 0) {
                System.out.println("Insira o número de produtos que deseja adicionar.");
                System.out.println("Insira 0 (zero) se não quiser adicionar produtos:");
                maxSize = scanner.nextInt();

                if (maxSize < 0) {
                    System.err.println("Valor incorreto inserido. Tente novamente.");
                    scanner.nextLine(); // Esvazia o buffer de entrada
                }
            }

            // Passo 4: Criar um ArrayList de produtos
            ArrayList<Product> products = new ArrayList<>();

            // Passo 5: Preencher o ArrayList com informações do usuário
            for (int i = 0; i < maxSize; i++) {
                scanner.nextLine(); // Esvazia o buffer de entrada
                System.out.println("Informe os detalhes do produto " + (i + 1));
                System.out.print("Nome: ");
                String name = scanner.nextLine();
                System.out.print("Quantidade: ");
                int quantity = scanner.nextInt();
                System.out.print("Preço: ");
                double price = scanner.nextDouble();
                System.out.print("Número do Item: ");
                int itemNumber = scanner.nextInt();

                // Criar um novo objeto Produto e adicionar ao ArrayList
                Product product = new Product();
                product.setName(name);
                product.setQuantity(quantity);
                product.setPrice(price);
                product.setItemNumber(itemNumber);
                products.add(product);
            }

            // Passo 6: Exibir informações dos produtos
            System.out.println("Lista de Produtos:");
            for (Product product : products) {
                System.out.println(product);
            }
        } catch (InputMismatchException e) {
            // Passo 3f: Lidar com exceções de entrada de dados incorretas
            System.err.println("Tipo incorreto de dados inserido!");
        } finally {
            scanner.close();
        }
    }
}

class Product {
    private String name;
    private int quantity;
    private double price;
    private int itemNumber;

    public Product() {
        // Construtor padrão
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, Quantidade: %d, Preço: %.2f, Número do Item: %d", name, quantity, price, itemNumber);
    }
}


/* 
 * Nesse codigo vocé ira inserir produtos que deseja cadastrar
 * Exemplo: Skate , Quantidade: 0, Preço: 100,00, Número do Item: 9821
 * Para rodar o codigo execute no terminal: 
 * cd erros 
 * java 5.java
 */
/* 
 * E um projeto mais para almoxarifado que deseja cadastrar produtos 
 */