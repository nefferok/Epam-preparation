public class Wheels {
    private int radius;
    private int wight;
    private int high;

    public Wheels(int radius, int wight, int high) {
        this.radius = radius;
        this.wight = wight;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "radius=" + radius +
                ", wight=" + wight +
                ", high=" + high +
                '}';
    }
}
