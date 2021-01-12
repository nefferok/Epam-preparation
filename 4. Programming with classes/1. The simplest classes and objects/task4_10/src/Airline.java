public class Airline {
    public enum Week {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    private String destination;
    private int flight;
    private String type;
    private String departureTime;
    private Week week;

    public Airline(String destination, int flight, String type, String departureTime, Week week) {
        this.destination = destination;
        this.flight = flight;
        this.type = type;
        this.departureTime = departureTime;
        this.week = week;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flight=" + flight +
                ", type='" + type + '\'' +
                ", departureTime=" + departureTime +
                ", week=" + week +
                '}';
    }
}
