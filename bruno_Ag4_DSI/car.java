import java.util.Scanner;

public class LocadoraSPCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe o valor da diária: ");
        double valorDiaria = scanner.nextDouble();

        System.out.print("Informe a quantidade de dias de locação: ");
        int quantidadeDias = scanner.nextInt();

        System.out.print("Informe a quantidade de Km percorridos: ");
        double quantidadeKm = scanner.nextDouble();

        // Cálculo do preço total
        double precoTotal = (valorDiaria * quantidadeDias) + (quantidadeKm * 0.20);

        // Exibição dos resultados
        System.out.println("\nResumo da Locação:");
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Valor total a pagar: R$" + precoTotal);

        scanner.close();
    }
}
