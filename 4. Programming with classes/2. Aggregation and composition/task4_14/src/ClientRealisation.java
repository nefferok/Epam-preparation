public class ClientRealisation {
    public static void main(String[] args) {
        Account[]accounts = new Account[6];

        accounts[0] = new Account(1047, 158.48);
        accounts[1] = new Account(1048, -157.48);
        accounts[2] = new Account(2047, 157.48);
        accounts[3] = new Account(1111, -157.48);
        accounts[4] = new Account(8745, 157.48);
        accounts[5] = new Account(7554, -157.48);

        System.out.println(accounts[4].toString());
        accounts[4].blockAccount();
        System.out.println(accounts[4].toString());

        Client client = new Client("Pupkin", accounts);
        client.sortByID();
        System.out.println(client.toString());

        System.out.println(client.totalAmount());
        System.out.println(client.totalDebt());
        System.out.println(client.totalCredit());

    }
}
