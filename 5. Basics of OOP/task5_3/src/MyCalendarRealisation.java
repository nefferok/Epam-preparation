import java.text.ParseException;

public class MyCalendarRealisation {
    public static void main(String[] args) throws ParseException {
        MyCalendar myDate = new MyCalendar("01.05.2020");
        myDate.addHoliday("Day of labour","01.05.2020");

        myDate.addHoliday("Victory Day","09.05.2020");
        myDate.addHoliday("My Birthday","26.04.2020");

        myDate.holidaysChecker();

    }
}
