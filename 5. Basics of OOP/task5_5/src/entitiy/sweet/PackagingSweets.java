package entitiy.sweet;

public enum PackagingSweets {
    CARDBOARD(15),
    METAL(30),
    CELLOPHANE(5);

    private int cost;

    PackagingSweets(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

}
