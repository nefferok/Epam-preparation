import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flights {
    private Airline [] airlines;
    private ArrayList<Airline> list;
    private String type;

    private static final String LIST_TYPE = "list";
    private static final String ARRAY_TYPE = "array";

    public Flights(ArrayList<Airline> list) {
        this.list = list;
        this.type = LIST_TYPE;
    }

    public Flights(Airline... airlines) {
        this.airlines = airlines;
        this.type = ARRAY_TYPE;
    }

    public void findDestination (String destination){
        System.out.println("\nProgram found the following:");
        int count = 0;
        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < airlines.length; i++) {
                if (airlines[i].getDestination().equals(destination)) {
                    System.out.println(airlines[i].toString());
                    count++;
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getDestination().equals(destination))
                    System.out.println(list.get(i).toString());
                    count++;
            }
        } if (count==0){
            System.out.println("No results");
        }

    }

    public void findDay (Airline.Week day) {
        System.out.println("\nProgram found the following:");
        int count = 0;

        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < airlines.length; i++) {
                if (airlines[i].getWeek().equals(day)) {
                    System.out.println(airlines[i].toString());
                    count++;
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getWeek().equals(day))
                    System.out.println(list.get(i).toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No results");
        }
    }

    public void findDayAndTime (Airline.Week day, String time) throws ParseException {
        System.out.println("\nProgram found the following:");
        int count =0;
        String pattern = "HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date timeFind = sdf.parse(time);

        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < airlines.length; i++) {
                Date timeI = sdf.parse(airlines[i].getDepartureTime());
                if (airlines[i].getWeek().equals(day)) {
                    if (timeFind.compareTo(timeI)==-1) {
                        System.out.println(airlines[i].toString());
                        count++;
                    }
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                Date timeI = sdf.parse(list.get(i).getDepartureTime());
                if (list.get(i).getWeek().equals(day)){
                    if (timeFind.compareTo(timeI)==-1){
                        System.out.println(list.get(i).toString());
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No results");
        }
    }
}
