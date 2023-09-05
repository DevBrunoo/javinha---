public class JogoDoXuxao {
    public static void main(String[] args) {
        int idadeJogador1 = 25;
        int idadeJogador2 = 30;
        
        boolean jogador1EhXuxao = idadeJogador1 < 18 || idadeJogador1 > 60;
        boolean jogador2EhXuxao = idadeJogador2 < 18 || idadeJogador2 > 60;
        
        if (jogador1EhXuxao && jogador2EhXuxao) {
            System.out.println("Os dois são jogadores!");
        } else if (jogador1EhXuxao) {
            System.out.println("Jogador 1 é o Xuxão viado!");
        } else if (jogador2EhXuxao) {
            System.out.println("Jogador 2 é o gay puto sfd!");
        } else {
            System.out.println("Nenhum Xuxão perdeu!");
        }
    }
}
