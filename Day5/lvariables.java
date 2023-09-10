public class TanquesExemplo {
    public static void main(String[] args) {
        int numTanks = 5; // Número total de tanques
        int tankNum = 3; // Número do tanque que estamos analisando

        // Exibindo informações sobre o tanque específico
        System.out.println("Tanque número: " + tankNum);
        System.out.println("Número total de tanques: " + numTanks);

        // Verificando se o número do tanque está dentro do intervalo válido
        if (tankNum >= 1 && tankNum <= numTanks) {
            System.out.println("Este é um tanque válido.");
        } else {
            System.out.println("Número de tanque inválido.");
        }

        // Realizando operações com as variáveis
        int tanquesRestantes = numTanks - tankNum;
        System.out.println("Tanques restantes: " + tanquesRestantes);
    }
}


/* 
 * Neste exemplo, numTanks representa o número total de 
 * tanques e tankNum representa o número de um tanque 
 * específico que estamos analisando. O programa exibe 
 * informações sobre o tanque específico, verifica se o 
 * número do tanque está dentro do intervalo 
 * válido e realiza operações simples com as variáveis.
 */