public class Criterias {
    private Type type;
    private Transport transport;
    private Nutrition nutrition;
    private int minDays;


    public Criterias(Type type, Transport transport, Nutrition nutrition, int days) {
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.minDays = days;
    }

    public Type getType() {
        return type;
    }

    public Transport getTransport() {
        return transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public int getDays() {
        return minDays;
    }
}
