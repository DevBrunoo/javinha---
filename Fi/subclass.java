public // Classe base para representar uma forma geométrica
class Shape {
    protected String nome;
    
    public Shape(String nome) {
        this.nome = nome;
    }
    
    public double calcularArea() {
        return 0.0; // Área padrão para formas genéricas
    }
    
    public void desenhar() {
        System.out.println("Desenhando uma forma genérica.");
    }
}

// Subclasse Square (quadrado) que herda de Shape
class Square extends Shape {
    private double lado;

    public Square(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado " + nome + " com lado de " + lado + " unidades.");
    }
}

public class ExemploClasseSquare {
    public static void main(String[] args) {
        // Criando um quadrado
        Square quadrado = new Square("Quadrado A", 5.0);

        // Chamando métodos da classe Shape e Square
        System.out.println("Nome: " + quadrado.nome);
        System.out.println("Área: " + quadrado.calcularArea());
        quadrado.desenhar();
    }
}
 {
    
}


/* 
 * Square (quadrado) como uma subclasse de uma classe Shape (forma). A classe Shape é a classe base que contém os atributos e métodos comuns a todas as formas geométricas, enquanto a classe Square herda da classe Shape e adiciona atributos e métodos específicos para representar um quadrado:
 * 
 */