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

    // Outros métodos, se necessário
}
