import java.util.ArrayList;
import java.util.Arrays;

public class RealisationCustomer {
    public static void main(String[] args) {
        // Реализованы сортировки и поиск при передаче массива и ArrayList

        Customer[] custArr = new Customer[5];
        custArr[0] = new Customer(12345, "Pupkin", "Ivan", "Petrovich", "Brest", 1234, 123445);
        custArr[1] = new Customer(12346, "Pechckin", "Ivan", "Petrovich", "Brest", 2222, 123445);
        custArr[2] = new Customer(12347, "Basechkin", "Ivan", "Petrovich", "Brest", 2223, 123445);
        custArr[3] = new Customer(12348, "Andreev", "Ivan", "Petrovich", "Brest", 2225, 123445);
        custArr[4] = new Customer(12349, "Kirov", "Ivan", "Petrovich", "Brest", 4040, 123445);

        ArrayList<Customer> list = new ArrayList<Customer>(Arrays.asList(custArr));
        GroupOfCustomers newGroup = new GroupOfCustomers(custArr);
        GroupOfCustomers newGroup1 = new GroupOfCustomers(list);

        newGroup.sortBySurname();
        newGroup1.sortBySurname();

        newGroup.findCard(2000, 3000);
        newGroup1.findCard(2000, 3000);

    }
}
