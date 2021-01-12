import java.util.Arrays;

public class Client {
    private String name;
    private Account [] accounts;

    public Client(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void searchingAccount(int id){
        for (int i = 0; i<accounts.length; i++){
            if (accounts[i].getId() == id){
                System.out.println(accounts[i].toString());
            }
        }
    }

    public void sortByID(){
        for(int i = this.accounts.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( this.accounts[j].getId() > this.accounts[j+1].getId() ){
                Account tmp = this.accounts[j];
                this.accounts[j] = this.accounts[j+1];
                this.accounts[j+1] = tmp;
            }
        }
    }
    }

    public double totalAmount (){
        double totalSum = 0;
        for (int i = 0; i <this.accounts.length ; i++) {
            totalSum += this.accounts[i].getSum();
        }
        return totalSum;
    }

    public  double totalDebt() {
        double totalSum = 0;
        for (int i = 0; i <this.accounts.length ; i++) {
            if(this.accounts[i].getSum()<0) {
                totalSum += this.accounts[i].getSum();
            }
        }
        return totalSum;
    }

    public  double totalCredit() {
        double totalSum = 0;
        for (int i = 0; i <this.accounts.length ; i++) {
            if(this.accounts[i].getSum()>0) {
                totalSum += this.accounts[i].getSum();
            }
        }
        return totalSum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}