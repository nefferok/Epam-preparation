import java.util.Objects;

public class Voucher implements Comparable<Voucher>{
    private String Country;
    private Type type;
    private Transport transport;
    private Nutrition nutrition;
    private int days;
    private int cost;

    public Voucher(String country, Type type, Transport transport, Nutrition nutrition,int days, int cost) {
        Country = country;
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.days = days;
        this.cost = cost;
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
        return days;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "Country='" + Country + '\'' +
                ", type=" + type +
                ", transport=" + transport +
                ", nutrition=" + nutrition +
                ", days=" + days +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return days == voucher.days &&
                cost == voucher.cost &&
                Objects.equals(Country, voucher.Country) &&
                type == voucher.type &&
                transport == voucher.transport &&
                nutrition == voucher.nutrition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Country, type, transport, nutrition, days, cost);
    }

    @Override
    public int compareTo(Voucher o) {
        if (this.cost > o.cost) {
            return 1;
        } else if (this.cost< o.cost){
            return -1;
        } else return 0;
    }
}
