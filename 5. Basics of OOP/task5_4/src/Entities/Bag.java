package Entities;

import java.util.ArrayList;

public class Bag {
    private ArrayList <Treasure> treasures;
    private int yourMoney;

    public Bag(int yourMoney) {
        this.treasures = new ArrayList<Treasure>();
        this.yourMoney = yourMoney;
    }

    public void addTreasure (Treasure treasure){
        if (treasure.getCost()>this.yourMoney){
            System.out.println("You don't have enough money for this treasure");
        } else {
            this.treasures.add(treasure);
            this.yourMoney = this.yourMoney - treasure.getCost();
        }
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public int getYourMoney() {
        return yourMoney;
    }
}
