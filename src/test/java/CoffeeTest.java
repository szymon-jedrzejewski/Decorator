import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeTest {

    @Test
    public void shouldPassIfGetPrice() {
        Ingredient coffee = new Coffee();
        int actual = coffee.getPrice();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassIfReturnsPriceOfCoffeeWithMilk() {
        Ingredient coffee = new Coffee(new Milk());

        int actual = coffee.getPrice();
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassIfReturnsPriceOfCoffeeWithSugar() {
        Ingredient coffee = new Coffee(new Sugar());

        int actual = coffee.getPrice();
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassIfReturnsPriceOfCoffeeWithMilkAndSugar() {
        Ingredient coffee = new Coffee(new Milk(new Sugar()));

        int actual = coffee.getPrice();
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassIfReturnsPriceOfCoffeeWithMilkAndCaramel() {
        Ingredient coffee = new Coffee(new Milk(new Caramel()));

        int actual = coffee.getPrice();
        int expected = 20;
        assertEquals(expected, actual);
    }
}