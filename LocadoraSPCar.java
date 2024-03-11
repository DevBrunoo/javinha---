// Aventura na Locadora SPCar 🚗💨

import java.util.Scanner;

public class LocadoraSPCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados (O que acontece na SPCar, fica na SPCar)
        System.out.print("Digite o modelo do carro alugado: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o valor da diária para locação: ");
        double diaria = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de locação: ");
        int dias = scanner.nextInt();

        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scanner.nextDouble();

        // Cálculo do preço total (matemática nivel expert)
        double precoTotal = diaria * dias + 0.20 * kmPercorridos;

        // Exibição dos resultados (fazendo o dinheiro sumir do bolso)
        System.out.println("\nModelo do carro: " + modelo);
        System.out.printf("Valor total a pagar: R$ %.2f%n", precoTotal);

        scanner.close();
    }
}
