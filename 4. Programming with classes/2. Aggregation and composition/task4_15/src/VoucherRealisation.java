import java.util.ArrayList;
import java.util.TreeSet;

public class VoucherRealisation {
    public static void main(String[] args) {
        ArrayList <Voucher> offers = new ArrayList<Voucher>();
        offers.add(new Voucher("Brazil", Type.REST, Transport.PLAIN, Nutrition.TWO_TIME,7, 700));
        offers.add(new Voucher("Chezh", Type.EXSCURSION, Transport.BUS, Nutrition.WITHOUT,9, 400));
        offers.add(new Voucher("German", Type.TREATMENT, Transport.BUS, Nutrition.TWO_TIME,8, 800));
        offers.add(new Voucher("Egypt", Type.REST, Transport.PLAIN, Nutrition.ALL_INCLUSIVE,10, 500));
        offers.add(new Voucher("Poland", Type.EXSCURSION, Transport.BUS, Nutrition.WITHOUT,5, 400));
        offers.add(new Voucher("Brazil", Type.REST, Transport.PLAIN, Nutrition.TWO_TIME,4,700));
        offers.add(new Voucher("Brazil", Type.REST, Transport.PLAIN, Nutrition.ONE_TIME,5, 700));

        Criterias find = new Criterias(Type.REST, Transport.PLAIN, Nutrition.ALL, 4);

        //TreeSet<Voucher> treeSet = new TreeSet<Voucher>(offers);

        //offers.addAll(treeSet);
        Offers offers1 = new Offers(offers);
        offers1.find(find);

    }
}
