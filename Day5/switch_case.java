import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma opção (A, B, C ou D): ");
        String opcao = scanner.nextLine();

        switch (opcao) {
            case "A":
                System.out.println("Você selecionou a opção A.");
                break;
            case "B":
                System.out.println("Você selecionou a opção B.");
                break;
            case "C":
                System.out.println("Você selecionou a opção C.");
                break;
            case "D":
                System.out.println("Você selecionou a opção D.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.print("Digite uma palavra: ");
        String s1 = scanner.nextLine();
        System.out.print("Digite outra palavra: ");
        String s2 = scanner.nextLine();

        if (s1.equals(s2)) {
            System.out.println("As duas palavras são iguais.");
        } else {
            System.out.println("As duas palavras são diferentes.");
        }

        scanner.close();
    }
}
