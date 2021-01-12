import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class GroupOfCustomers {
    private Customer [] customers;
    private ArrayList<Customer> list;
    private String type;

    private static final String LIST_TYPE = "list";
    private static final String ARRAY_TYPE = "array";

    public GroupOfCustomers(ArrayList<Customer> list) {
        this.list = list;
        this.type = LIST_TYPE;
    }

    public GroupOfCustomers(Customer... customers) {
        this.customers = customers;
        this.type = ARRAY_TYPE;
    }

    public void sortBySurname(){
        Comparator<Customer> comparator = new CompareByName();
        TreeSet<Customer> bySurname = new TreeSet<>(comparator);

            if (this.type.equals(ARRAY_TYPE)) {
                bySurname.addAll(Arrays.asList(customers));
            } else if (this.type.equals(LIST_TYPE)) {
                bySurname.addAll(list);
            }

        System.out.println("\nSort by surname");
        for (Customer client:bySurname) {
            System.out.println(client.toString());
        }

    }

    public void findCard (int start, int end){
        System.out.println("\nProgram found the following:");

        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < customers.length; i++) {
                if (customers[i].getCard() >= start && customers[i].getCard() <= end) {
                    System.out.println(customers[i].toString());
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCard()  >= start && list.get(i).getCard()<= end)
                    System.out.println(list.get(i).toString());
            }
        }

    }
}
