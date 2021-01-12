package task2_4_2;

public class Task2_4_2 {

    public static int gcd (int a, int b, int c, int d){
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        while (c !=0) {
            int tmp = a%c;
            a = c;
            c = tmp;
        }
        while (d !=0) {
            int tmp = a%d;
            a = d;
            d = tmp;
        }
        return a;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(gcd (15, 9, 12, 6));
    }  
}
