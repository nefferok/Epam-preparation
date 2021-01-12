package entitiy.bouquet;

public enum PackagingFlowers {
    PAPER(10),
    CELLOPHANE(5),
    BASKET(30);

    private int cost;

    PackagingFlowers(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }


}
