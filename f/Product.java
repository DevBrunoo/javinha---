public class Product {
    private int itemNumber;
    private String name;
    private double price;
    private int quantity;
    private boolean active;

    public Product(int itemNumber, String name, double price, int quantity) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.active = true; // Produto é ativo por padrão
    }

    // Getters e setters

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Número do Item: " + getItemNumber() + "\n" +
               "Nome: " + getName() + "\n" +
               "Quantidade em estoque: " + getQuantity() + "\n" +
               "Preço: $" + getPrice() + "\n" +
               "Valor do Estoque: $" + (getPrice() * getQuantity()) + "\n" +
               "Estado do Produto: " + (isActive() ? "Ativo" : "Descontinuado");
    }
}
