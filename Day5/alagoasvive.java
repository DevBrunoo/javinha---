public class EqualsExample {
    public static void main(String[] args) {
        // Comparando duas palavras com o sotaque alagoano
        String palavra1 = "arroz";
        String palavra2 = "arrôiz"; // Metodo equals compara as duas string. se for igual e True ne pai, agora se nao for bichooo ai e falso, se e falso e "balde"
        
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras são iguais, bicho!");
        } else {
            System.out.println("As palavras são diferentes, viu?");
        }
    }
}
