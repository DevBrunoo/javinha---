import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pressione a tecla 's': ");
        String key = scanner.nextLine();

        if (key.equals("s")) {
            System.out.println("Skate");
        }
    }
}
