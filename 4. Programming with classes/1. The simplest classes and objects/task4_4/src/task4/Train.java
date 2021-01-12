package task4;

public class Train {
    private String destination;
    private int number;
    private String departureTime;

    public Train(String destination, int number, String departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
