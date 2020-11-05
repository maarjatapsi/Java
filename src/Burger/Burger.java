package Burger;

public class Burger {

    private String name;
    private String meat;
    private double price;
    private String bread;

    public Burger(String name, String meat, double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Burger: " + name + ", price: " + price + ", meat: " +  meat + ", bread: " + bread;
    }

}
