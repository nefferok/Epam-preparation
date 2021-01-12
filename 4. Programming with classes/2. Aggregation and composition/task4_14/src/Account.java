public class Account{
    private int id;
    private boolean isBlock;
    private double sum;

    public Account(int id, double sum) {
        this.id = id;
        this.sum = sum;
        if(sum < 0){
            this.isBlock = true;
        } else this.isBlock = false;
    }
    public void blockAccount(){
        this.isBlock =true;
    }
    public void unblockAccount(){
        this.isBlock = false;
    }

    public int getId() {
        return id;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", isBlock=" + isBlock +
                ", sum=" + sum +
                '}';
    }


}
