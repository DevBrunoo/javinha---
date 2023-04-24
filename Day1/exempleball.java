package Day1;

class Ball {
    int bola = 4;
    int gol = 8;

    void changeBall(int newValue){
        // atualiza a variável bola com o novo valor
        bola = newValue;
    } 
    
    void chutaBola(int forca){
        // atualiza a variável bola com o novo valor após ser chutada
        bola = bola - forca;
    }
    
    void exibeStatus(){
        // exibe o status atual das variáveis bola e gol
        System.out.println("Bola: " + bola + " | Gol: " + gol);
    }
    
    public static void main(String[] args){
        // cria uma nova instância da classe Ball
        Ball minhaBola = new Ball();
        
        // exibe o status inicial da bola
        minhaBola.exibeStatus();
        
        // chuta a bola com uma força de 2
        minhaBola.chutaBola(2);
        
        // exibe o novo status da bola
        minhaBola.exibeStatus();
        
        // muda o valor da bola para 10
        minhaBola.changeBall(10);
        
        // exibe o novo status da bola
        minhaBola.exibeStatus();
    }
}
