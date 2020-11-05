package Burger;

import java.util.Scanner;

public class SetAddition{

    Addition add1, add2, add3, add4;

    public SetAddition(Addition add1, Addition add2, Addition add3, Addition add4) {
        this.add1 = add1;
        this.add2 = add2;
        this.add3 = add3;
        this.add4 = add4;
    }

    public boolean chooseAddition(Addition add){
        System.out.println("Do you want: " + add.getAddName() + " price: " + add.getAddPrice() + "? y/n");
        Scanner reader = new Scanner(System.in);
        String answer = reader.nextLine();
        if(answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}
