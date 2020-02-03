public class Caramel implements Ingredient {

    private int price = 7;

    public Caramel() {

    }

    public Caramel(Ingredient ingredient) {
        price = ingredient.getPrice() + price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
