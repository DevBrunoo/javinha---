import java.util.Scanner;

public class DadosAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a série do aluno: ");
        String serie = scanner.nextLine();

        System.out.print("Digite o telefone do aluno: ");
        String telefone = scanner.nextLine();

        double media = 0;

        // Trata exceção para garantir que o usuário insira um valor numérico para a média
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Digite a média do aluno: ");
                media = scanner.nextDouble();
                entradaValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico para a média.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        System.out.println("\n--------------------------- Técnico em Informática EaD ---------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Série: " + serie);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("\nMédia: " + media);

        scanner.close();
    }
}
