public class IncrementDecrementExample {
    public static void main(String[] args) {
        int pressa = 0;     // Variable to represent "pressa" a variavel esta presente, o que nao esta e minha paciencia 
        int fraco = 5;      // Variable to represent "fraco" dsggg 
        int covarde = 10;   // Variable to represent "covarde" aqui estou falando da classe burguesa safada
        
        
        // Increment operators (++): Increases the value by 1
        pressa++;           // pressa = 1
        
        // Decrement operators (--): Decreases the value by 1
        fraco--;            // fraco = 4
        covarde--;          // covarde = 9
        
        // Post-increment operators: The current value is used before the increment
        int vitória = pressa++;  // vitória = 1, pressa = 2
        
        // Pre-decrement operators: The decrement happens before the value is used
        int espaço = --fraco;    // espaço = 3, fraco = 3
        
        // Compound assignment operators (+=, -=): Modify and assign values
        fraco += 2;             // fraco = 5 + 2 = 7
        covarde -= 3;           // covarde = 9 - 3 = 6
        
        // Using the variables and phrases in output
        System.out.println("A pressa é a inimiga da " + (vitória == 1 ? "vitória" : "derrota") + ".");
        System.out.println("O " + (fraco <= 5 ? "fraco" : "forte") + " não tem espaço.");
        System.out.println("O " + (covarde >= 10 ? "covarde" : "valente") + " morre sem tentar!");
    }
}
