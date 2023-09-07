public class TryCatchExample {
    public static void 
main(String[] args) {
        try {
            // Tentativa de código 
que pode gerar uma exceção
            int resultado = 
dividePorZero();
            
System.out.println("Resultado: " + 
resultado);
        } catch 
(ArithmeticException e) {
            // Captura e trata a 
exceção ArithmeticException
            
System.err.println("Erro: Divisão 
por zero detectada!");
            e.printStackTrace();
        } finally {
            // Este bloco é 
executado independentemente de 
ocorrer uma exceção ou não
            
System.out.println("Bloco finally 
executado.");
        }
        
        // O programa continua a 
ser executado após o tratamento da 
exceção
        
System.out.println("Programa 
continua a ser executado após o 
bloco catch.");
    }
    
    public static int 
dividePorZero() {
        int numerador = 10;
        int denominador = 0;
        return numerador / 
denominador;
    }
}
//Criando try/Catch, se trata de 
exceções de verificadas e não 
verificadas 

