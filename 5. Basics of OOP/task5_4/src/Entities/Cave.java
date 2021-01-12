package Entities;

public class Cave {
    private Dragon dragon;
    private Treasure[] treasures;

    public Cave(Dragon dragon) {
        this.dragon = dragon;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }
}
