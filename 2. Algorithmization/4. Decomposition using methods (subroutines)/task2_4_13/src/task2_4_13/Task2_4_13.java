package task2_4_13;

public class Task2_4_13 {

    public static void twins(int n){
        int twins1 = n;
        int twins2 = n+2;
        System.out.println(twins1 + " близнец "+ twins2);
    }

    public static void allTwins (int n){
        for (int i = n; i<=2*n-2; i++){
            twins(i);
        }
    }

    public static void main(String[] args) {

        allTwins(24);
    }   
}
