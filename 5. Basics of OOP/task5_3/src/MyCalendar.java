import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {
    private GregorianCalendar date;
    private boolean isHoliday;
    private ArrayList<Holiday> holidays;

    public MyCalendar(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date d = format.parse(date);
        GregorianCalendar g = new GregorianCalendar();
        g.setTime(d);
        this.date = g;
    }

     class Holiday {
        private GregorianCalendar holiday;
        private String description;

        public Holiday(String description, String holiday) throws ParseException {
            this.description = description;
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date d = format.parse(holiday);
            GregorianCalendar g = new GregorianCalendar();
            g.setTime(d);
            this.holiday = g;
        }

         public GregorianCalendar getHoliday() {
             return holiday;
         }

         public String getDescription() {
             return description;
         }
     }
    public void addHoliday (String description,String date) throws ParseException {
        if (this.holidays == null){
             this.holidays = new ArrayList<Holiday>();
        }
        this.holidays.add(new Holiday(description, date));
        }

    public void holidaysChecker(){
        this.isHoliday = false;
        String out = "This is working day\nYou should go to work";
        if (this.date.get(GregorianCalendar.DAY_OF_WEEK)==7 || this.date.get(GregorianCalendar.DAY_OF_WEEK)==1){
            this.isHoliday = true;
            out = "This day is day-off\nYou can stay at home";
        } else {
            for (int i = 0; i <holidays.size() ; i++) {
                if (this.date.equals(holidays.get(i).getHoliday())){
                    out = "This day is " + holidays.get(i).getDescription() + "\nYou can stay at home";
                }
            }
        }
        System.out.println(out);
    }
}

