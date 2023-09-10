public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor padrão
    public Carro() {
        marca = "Desconhecida";
        modelo = "Desconhecido";
        ano = 0;
    }

    // Construtor com parâmetros marca e modelo
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        ano = 0; // Define o ano como 0 por padrão
    }

    // Construtor com todos os parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos para obter informações do carro
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Toyota", "Corolla");
        Carro carro3 = new Carro("Honda", "Civic", 2022);

        System.out.println("Carro 1:");
        carro1.exibirInformacoes();

        System.out.println("\nCarro 2:");
        carro2.exibirInformacoes();

        System.out.println("\nCarro 3:");
        carro3.exibirInformacoes();
    }
}


/* 
 * Sobre carga
 */