package Burger;

import java.util.Map;
import java.util.Scanner;

public class Order{

    Map<Burger, SetAddition> menu;

    private Burger burger;
    private Double burgerPrice;
    private SetAddition burgerAdditions;

    public Order(Map<Burger, SetAddition> menu) {
       this.menu = menu;
    }

    public void BurgerChoice(){

        while(true){
            System.out.println("Which burger do you want? Insert the correct name");
            Scanner reader = new Scanner(System.in);
            String choice = reader.nextLine();
            for (Map.Entry<Burger, SetAddition> entry : menu.entrySet()) {
                if(entry.getKey().getName().matches(choice)){
                    this.burger = entry.getKey();
                    this.burgerPrice = entry.getKey().getPrice();
                    this.burgerAdditions = entry.getValue();
                }
            }
            if(this.burger != null && this.burgerAdditions != null) {
                break;
            } else {
                System.out.println("There was a mistake, try again");
            }
        }
    }

    public void AdditionChoice(){
        if(burgerAdditions.chooseAddition(this.burgerAdditions.add1))
        {
            this.burgerPrice = this.burgerPrice + this.burgerAdditions.add1.getAddPrice();
        };
        if(burgerAdditions.chooseAddition(this.burgerAdditions.add2)){
            this.burgerPrice = this.burgerPrice + this.burgerAdditions.add2.getAddPrice();
        }
        if(burgerAdditions.chooseAddition(burgerAdditions.add3)){
            this.burgerPrice = this.burgerPrice + this.burgerAdditions.add3.getAddPrice();
        }
        if(burgerAdditions.chooseAddition(burgerAdditions.add4)){
            this.burgerPrice = this.burgerPrice + this.burgerAdditions.add4.getAddPrice();
        }

    }

    public void finalPrice(){
        this.burgerPrice = Math.round(this.burgerPrice * 20) / 20.0;
        System.out.println("Final price: " + this.burgerPrice + "€");
    }

}
