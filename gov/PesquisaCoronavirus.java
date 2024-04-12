import java.util.Scanner;

public class PesquisaCoronavirus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os totais
        int totalEntrevistados = 50;
        int totalIdade = 0;
        int totalHomens = 0;
        
        // Loop para obter informações de cada entrevistado
        for (int i = 0; i < totalEntrevistados; i++) {
            System.out.println("Entre com a idade da pessoa " + (i+1) + ":");
            int idade = scanner.nextInt();
            totalIdade += idade; // Somando as idades para calcular a média
            
            System.out.println("Entre com o sexo da pessoa " + (i+1) + " (0=masc, 1=fem):");
            int sexo = scanner.nextInt();
            if (sexo == 0) {
                totalHomens++; // Incrementando o total de homens
            }
        }
        
        // Calculando a média de idade
        double mediaIdade = (double) totalIdade / totalEntrevistados;
        
        // Calculando o percentual de homens e mulheres
        double percentualHomens = ((double) totalHomens / totalEntrevistados) * 100;
        double percentualMulheres = 100 - percentualHomens;
        
        // Exibindo os resultados
        System.out.println("Média de idade das pessoas entrevistadas: " + mediaIdade);
        System.out.println("Percentual de homens entrevistados: " + percentualHomens + "%");
        System.out.println("Percentual de mulheres entrevistadas: " + percentualMulheres + "%");
        
        scanner.close();
    }
}
