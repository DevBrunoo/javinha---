public class DVDProduct extends Product {
    private int duration;
    private String rating;
    private String studio;

    public DVDProduct(int itemNumber, String name, double price, int quantity, int duration, String rating, String studio) {
        super(itemNumber, name, price, quantity);
        this.duration = duration;
        this.rating = rating;
        this.studio = studio;
    }

    // Getters e setters para os campos específicos de DVD

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    // Outros métodos, se necessário

    @Override
    public String toString() {
        return "Número do Item: " + getItemNumber() + "\n" +
               "Nome: " + getName() + "\n" +
               "Duração do Filme: " + duration + " minutos\n" +
               "Classificação Etária: " + rating + "\n" +
               "Estúdio Cinematográfico: " + studio + "\n" +
               "Quantidade em estoque: " + getQuantity() + "\n" +
               "Preço: $" + getPrice() + "\n" +
               "Valor do Estoque: $" + (getPrice() * getQuantity()) + "\n" +
               "Estado do Produto: " + (isActive() ? "Ativo" : "Descontinuado");
    }
}
