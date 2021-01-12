package task2_4_6;

public class Task2_4_6 {

    public static boolean gcd (int a, int b, int c){
        
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
        return a == 1;
        }

    public static void main(String[] args) {

        System.out.println( gcd(2, 4, 3)?"Взаимно простые":"Не взаимно простые");
    }
    
}
