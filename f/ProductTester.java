import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie objetos CD e DVDProduct
        CD cd1 = new CD(1, "Nome do CD", 10.99, 100, "Artista CD", 15, "Selo CD");
        DVDProduct dvd1 = new DVDProduct(2, "Nome do DVD", 19.99, 50, 120, "Classificação DVD", "Estúdio DVD");

        // Adicione ou deduza estoque
        System.out.print("Quantidade a ser adicionada ao estoque do CD1: ");
        int addQuantityCD = scanner.nextInt();
        cd1.addStock(addQuantityCD);

        System.out.print("Quantidade a ser deduzida do estoque do DVD1: ");
        int deductQuantityDVD = scanner.nextInt();
        dvd1.deductStock(deductQuantityDVD);

        // Exiba informações dos produtos
        System.out.println("\nInformações do CD1:");
        System.out.println(cd1);

        System.out.println("\nInformações do DVD1:");
        System.out.println(dvd1);

        scanner.close();
    }
}
