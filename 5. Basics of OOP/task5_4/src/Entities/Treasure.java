package Entities;

public class Treasure {
    private int number;
    private String description;
    private int cost;

    public Treasure(int number, String description, int cost) {
        this.number = number;
        this.description = description;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "number=" + number +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
