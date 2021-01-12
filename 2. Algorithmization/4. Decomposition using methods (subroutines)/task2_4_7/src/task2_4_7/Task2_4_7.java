package task2_4_7;

public class Task2_4_7 {

    public static int integral (int a){
        int in=1;
        for (int i =1; i<=a; i++){
            in = in*i;
        }
        return in;
    }

    public static int sumIntegral (int a){
        int sum=0;
        
        for (int i =1; i<=a; i++){
            if (i%2 != 0 ){
            sum = sum + integral(i);    
            }      
        }
        return sum;
    }
    
    public static void main(String[] args) {

        System.out.println(sumIntegral(9));
    }
}
