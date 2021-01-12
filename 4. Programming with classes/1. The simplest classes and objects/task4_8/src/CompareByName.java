import java.util.Comparator;

public class CompareByName implements Comparator <Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
