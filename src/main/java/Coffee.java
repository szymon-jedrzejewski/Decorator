public class Coffee implements Ingredient {

    private int price = 8;

    public Coffee() {
    }

    public Coffee(Ingredient ingredient) {
        price = ingredient.getPrice() + price;
    }

    public int getPrice() {
        return price;
    }
}
