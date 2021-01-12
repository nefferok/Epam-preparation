package task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class TrainCompareTime implements Comparator <Train> {
    @Override
    public int compare(Train o1, Train o2) {
        String pattern = "HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Date time1 = null;
        try {
            time1 = sdf.parse(o1.getDepartureTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date time2 = null;
        try {
            time2 = sdf.parse(o2.getDepartureTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time1.compareTo(time2);

        }

    }

