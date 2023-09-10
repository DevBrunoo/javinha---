// Classe base para representar um personagem genérico
class Personagem {
    private String nome;
    private int idade;

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void falar() {
        System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
    }
}

// Classe que herda de Personagem para representar Charlie Brown
class CharlieBrown extends Personagem {
    public CharlieBrown(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println("Oi, eu sou o Charlie Brown e tenho " + getIdade() + " anos.");
    }

    public void pensar() {
        System.out.println("Estou sempre pensando em como melhorar as coisas.");
    }
}

// Classe que herda de Personagem para representar Lucy
class Lucy extends Personagem {
    public Lucy(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println("Olá, eu sou a Lucy e tenho " + getIdade() + " anos.");
    }

    public void dar conselhos() {
        System.out.println("Eu sempre sei o que fazer!");
    }
}

public class ExemploHerancaCharlieBrown {
    public static void main(String[] args) {
        // Criando instâncias de Charlie Brown e Lucy
        CharlieBrown charlieBrown = new CharlieBrown("Charlie Brown", 8);
        Lucy lucy = new Lucy("Lucy van Pelt", 7);

        // Chamando os métodos de fala de cada personagem
        charlieBrown.falar();
        lucy.falar();

        // Chamando métodos específicos de cada personagem
        charlieBrown.pensar();
        lucy.darConselhos();
    }
}


/* 
 * Neste exemplo, temos uma classe base chamada Personagem que representa características comuns a todos os personagens, como nome e idade. Em seguida, criamos duas classes, CharlieBrown e Lucy, que herdam de Personagem para representar personagens específicos da série Charlie Brown. Cada classe filha sobrescreve o método falar() para exibir informações específicas sobre o personagem e também possui métodos exclusivos, como pensar() para Charlie Brown e darConselhos() para Lucy.

O método main cria instâncias de CharlieBrown e Lucy e demonstra como você pode chamar os métodos de cada personagem, incluindo os métodos herdados e os métodos específicos de cada classe filha. Isso ilustra o conceito de herança em Java, onde as classes filhas herdam os atributos e comportamentos da classe pai e podem adicionar funcionalidades adicionais.
 */