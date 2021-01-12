package task2_4_1;

public class Task2_4_1 {

    public static int gcd (int a, int b){
        return b==0 ? a : gcd (b, a%b);
        
    }
    public static int lcm (int a, int b){
        return a  / gcd(a,b) * b;
        
    }
    public static void main(String[] args) {

    }
    
}
