package Utilites;

import Entities.Bag;
import Entities.Cave;

import java.io.FileWriter;
import java.io.IOException;

public class TreasureWriter {


    public static void writeInFile(Bag bag) throws IOException {
        FileWriter writer = new FileWriter("Treasures in Bag.txt", false);
        for (int i = 0; i <bag.getTreasures().size(); i++) {
            writer.write(bag.getTreasures().get(i).toString()+"\n");
        }
        writer.flush();
    }

    public static void writeInFile(Cave cave) throws IOException {
        FileWriter writer = new FileWriter("Treasures in Cave.txt", false);
        for (int i = 0; i <cave.getTreasures().length; i++) {
            writer.write(cave.getTreasures()[i].toString()+"\n");
        }
        writer.flush();
    }
}
