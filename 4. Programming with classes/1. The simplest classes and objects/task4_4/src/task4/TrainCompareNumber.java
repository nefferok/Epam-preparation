package task4;

import java.util.Comparator;

public class TrainCompareNumber implements Comparator <Train> {
    @Override
    public int compare(Train o1, Train o2) {
        if (o1.getNumber()>o2.getNumber())
            return 1;
        else if (o1.getNumber()<o2.getNumber())
            return -1;
        else
            return 0;
    }
}
