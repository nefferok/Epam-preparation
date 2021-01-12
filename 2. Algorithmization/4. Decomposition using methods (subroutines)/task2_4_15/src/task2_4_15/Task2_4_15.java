package task2_4_15;

public class Task2_4_15 {

    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i<length(n).length; i++){
            System.out.println(length(n)[i]);
        }
    }

    public static  int [] length (int length){
        int t;
        if (length <= 9){
        t = 10-length;}
        else {t=length;}
        int [] arr = new int [t];
        for (int i = 0; i<t; i++){
            arr [i] = number (length, i+1);
        }
        return arr;
    }
    
    public static int number (int length, int first){
       
        int pow =(int) Math.pow(10, (length-1));
        int num = 0;
        for (int i = 1; i<=length; i++){
            num+=first*pow;
            pow /=10;
            first++;
            }        
        return num;
    }
}
