public class Person {
    private String name;  // Campo de instância

    public Person(String name) {
        this.name = name;  // Usando this para atribuir o valor ao campo de instância
    }

    public void printName() {
        System.out.println("Name: " + this.name);  // Usando this para acessar o campo de instância
    }
}
