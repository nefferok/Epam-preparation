import java.util.Comparator;

public class Customer{
    private int id;
    private String surname;
    private String name;
    private String secondName;
    private String adres;
    private int card;
    private int account;

    public Customer(int id, String surname, String name, String secondName, String adres, int card, int account) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.adres = adres;
        this.card = card;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + surname + " " + name + " " + secondName + '\'' +
                ", adres='" + adres + '\'' +
                ", card=" + card +
                ", account=" + account +
                '}';
    }
}
