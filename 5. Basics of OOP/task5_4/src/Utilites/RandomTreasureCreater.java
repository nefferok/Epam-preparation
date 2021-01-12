package Utilites;

import Entities.Treasure;

public class RandomTreasureCreater {
    public static Treasure [] creater(){
    Treasure [] treasures = new Treasure[100];
    String name;
    int cost;
    for (int i = 0; i<100; i++){
        name = "Treasure "+ (i+1);
        cost = (int) ((Math.random() * 1000));
        treasures[i] = new Treasure(i+1, name, cost);
        }
    return treasures;
    }
}
