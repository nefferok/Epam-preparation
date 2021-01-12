package entitiy.bouquet;

public enum Flowers {
    ROSE_1("Red", 60, 50),
    ROSE_2("White", 60,50),
    ROSE_3("Yellow", 60,50),
    ROSE_4("Red", 70,60),
    ROSE_5("White", 70,60),
    ROSE_6("Yellow", 70,60),
    TULIP_1("Red", 40, 25),
    TULIP_2("White", 40, 25),
    TULIP_3("Yellow", 40, 25);


    private String color;
    private int lengthCm;
    private int cost;

    Flowers(String color, int lengthCm, int cost) {
        this.color = color;
        this.lengthCm = lengthCm;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public int getLengthCm() {
        return lengthCm;
    }
    public String getType(){
        if (this.equals(ROSE_1) || this.equals(ROSE_2)||
                this.equals(ROSE_3) || this.equals(ROSE_4)||
                this.equals(ROSE_5) || this.equals(ROSE_6)) return "rose";
        else if (this.equals(TULIP_1)||this.equals(TULIP_2)||this.equals(TULIP_3)) return "tulip";
        else return "no flowers";
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getType() + ", lenght - " + this.getLengthCm();
    }
}
