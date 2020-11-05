package Burger;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Burger, SetAddition> menu = new HashMap<>();

        Burger burger1 = new Burger("Chicken burger", "chicken", 8.20, "white bread");
        SetAddition add1 = new SetAddition(new Addition("cheese", 0.50), new Addition("salad", 0.40),  new Addition("tomato", 0.30), new Addition( "mayo", 0.50));
        menu.put(burger1, add1);

        Burger burger2 = new Burger("Old Fashioned Cheeseburger", "beef", 9.00, "white bread");
        SetAddition add2 = new SetAddition(new Addition("bacon", 0.90), new Addition("cucumber", 0.30), new Addition("onion", 0.30), new Addition("bacon sauce", 0.50));
        menu.put(burger2, add2);

        Burger burger3 = new Burger("New York Burger", "beef", 12.40,"white bread");
        SetAddition add3 = new SetAddition(new Addition("ananas", 0.70), new Addition("tomato", 0.30), new Addition("cucumber", 0.30), new Addition("onion", 0.30));
        menu.put(burger3, add3);

        System.out.println("Burger menu: ");
        System.out.println("1. " + burger1);
        System.out.println("2. " + burger2);
        System.out.println("3. " + burger3);

        Order order = new Order(menu);
        order.BurgerChoice();
        order.AdditionChoice();
        order.finalPrice();

    }
}
