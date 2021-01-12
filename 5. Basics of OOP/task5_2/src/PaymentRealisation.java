import java.io.IOException;

public class PaymentRealisation {
    public static void main(String[] args) throws IOException {
        Payment payment1 = new Payment("First payment");
        Payment payment2 = new Payment("Second payment");

        payment1.setPayment();
        payment2.setPayment();

        payment1.printCheque();
        payment2.printCheque();
    }
}
