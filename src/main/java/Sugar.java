public class Sugar implements Ingredient {

    private int price = 3;

    public Sugar() {
    }

    public Sugar(Ingredient ingredient) {
        price = ingredient.getPrice() + price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
