package task4;

import java.util.Comparator;

public class TrainCompareDestination implements Comparator <Train> {

    @Override
    public int compare(Train o1, Train o2) {
        return o1.getDestination().compareTo(o2.getDestination());
    }
}
