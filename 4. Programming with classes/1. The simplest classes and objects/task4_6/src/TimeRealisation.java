public class TimeRealisation {
    public static void main(String[] args) {
        Time defaul = new Time();
        System.out.println("Default time: "+ defaul.toString());

        Time myTime = new Time(14, 32, 48);
        System.out.println("My time: "+ myTime.toString());

        myTime.setHour(22);
        myTime.setMinute(22);
        myTime.setSecond(22);
        System.out.println("My new time: "+ myTime.toString());

        myTime.setTime(11, 11, 11);
        System.out.println("My new time: "+ myTime.toString());

    }
}
