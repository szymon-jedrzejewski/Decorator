public class Milk implements Ingredient {

    private int price = 5;

    public Milk() {
    }

    public Milk(Ingredient ingredient) {
        price = ingredient.getPrice() + price;
    }

    public int getPrice() {
        return price;
    }
}
