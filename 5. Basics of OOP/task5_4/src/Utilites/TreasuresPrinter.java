package Utilites;

import Entities.Treasure;

import java.util.ArrayList;

public class TreasuresPrinter {

    public static void printArray (Treasure [] treasures){
        for (int i = 0; i <treasures.length ; i++) {
            System.out.println(treasures[i].toString());
        }
    }

    public static void printList (ArrayList<Treasure>treasures){
        if (treasures.isEmpty()){
            System.out.println("You don't have treasures in your bag!");
        }else {
            for (int i = 0; i < treasures.size(); i++) {
                System.out.println(treasures.get(i).toString());
            }
        }
    }
}
