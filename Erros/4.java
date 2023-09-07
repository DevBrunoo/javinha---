public class TryCatchDemo {
    public static void 
main(String[] args) {
        try {
            // Vamos tentar acessar 
algo que não existe (ponteiro 
nulo).
            String mensagem = 
obterMensagem();
            
System.out.println("Mensagem: " + 
mensagem);
        } catch 
(NullPointerException e) {
            // Oh, não! Temos um 
problema com o ponteiro nulo!
            
System.err.println("Erro: Ponteiro 
nulo detectado!");
            e.printStackTrace();
        }
    }

    // Este método retorna uma 
mensagem que é nula.
    public static String 
obterMensagem() throws 
NullPointerException {
        // Você pediu uma mensagem, 
mas eu esqueci de defini-la. Oops!
        String mensagemNula = null;
        if (mensagemNula == null) {
            throw new 
NullPointerException("A mensagem 
está nula, camarada!");
        }
        return mensagemNula;
    }
}

