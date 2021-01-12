package entitiy.sweet;

public enum Sweets {
    COOKIES(15),
    LOLLIPOPS(10),
    SWEETS(12),
    CHOCOLATE(20);

    private int cost;

    Sweets(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

}
