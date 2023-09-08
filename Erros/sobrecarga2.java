public class Cachorro {
    private double altura;
    private int latidos;

    // Construtor padrão
    public Cachorro() {
        altura = 0.0;
        latidos = 0;
    }

    // Construtor com altura
    public Cachorro(double altura) {
        this.altura = altura;
        latidos = 0; // Define o número de latidos como 0 por padrão
    }

    // Construtor com altura e latidos
    public Cachorro(double altura, int latidos) {
        this.altura = altura;
        this.latidos = latidos;
    }

    // Métodos para obter informações do cachorro
    public double getAltura() {
        return altura;
    }

    public int getLatidos() {
        return latidos;
    }

    public void latir() {
        latidos++;
    }

    public void exibirInformacoes() {
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Número de latidos: " + latidos);
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro(30.5);
        Cachorro cachorro3 = new Cachorro(25.0, 5);

        System.out.println("Cachorro 1:");
        cachorro1.exibirInformacoes();

        System.out.println("\nCachorro 2:");
        cachorro2.exibirInformacoes();

        System.out.println("\nCachorro 3:");
        cachorro3.exibirInformacoes();

        cachorro3.latir();
        cachorro3.latir();
        System.out.println("\nCachorro 3 depois de latir duas vezes:");
        cachorro3.exibirInformacoes();
    }
}


/* 
 * Neste exemplo, a classe Cachorro possui três construtores:

Um construtor padrão que não recebe parâmetros e define valores padrão para a altura e o número de latidos.
Um construtor que recebe o parâmetro "altura" e define um valor padrão para o número de latidos.
Um construtor que recebe ambos os parâmetros "altura" e "latidos".
No método main, criamos três objetos Cachorro usando esses construtores diferentes e demonstramos como você pode configurar a altura e o número de latidos para cada cachorro. Além disso, chamamos o método latir para o terceiro cachorro para aumentar o número de latidos e exibimos as informações atualizadas. Isso ilustra como a sobrecarga de construtores permite criar objetos com diferentes conjuntos de valores de atributos.
 */