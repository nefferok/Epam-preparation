import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class RealisationAirline {
    public static void main(String[] args) throws ParseException {

        Airline[] airlines = new Airline[5];

        airlines[0] = new Airline("Moscow", 2043, "liner", "12:44", Airline.Week.SUNDAY);
        airlines[1] = new Airline("Minsk", 2044, "liner", "13:45", Airline.Week.SUNDAY);
        airlines[2] = new Airline("Kiev", 2045, "liner", "11:44", Airline.Week.MONDAY);
        airlines[3] = new Airline("Astana", 2046, "liner", "10:44", Airline.Week.MONDAY);
        airlines[4] = new Airline("Moscow", 2047, "liner", "12:44", Airline.Week.THURSDAY);

        ArrayList<Airline>list = new ArrayList<Airline>(Arrays.asList(airlines));

        Flights flightsArray = new Flights(airlines);
        Flights flightsList = new Flights(list);


        flightsArray.findDay(Airline.Week.MONDAY);
        flightsList.findDay(Airline.Week.SUNDAY);


        flightsArray.findDestination("Moscow");
        flightsList.findDestination("Kiev");


        flightsArray.findDayAndTime(Airline.Week.SUNDAY, "12:00");
        flightsList.findDayAndTime(Airline.Week.MONDAY, "11:00");

    }
}
