package task2_4_3;

public class Task2_4_3 {

    public static double sTriangle (double a){
        double s = Math.sqrt(3)/4*Math.pow(a, 2);
        return s;
    }

    public static double sSixangle (double a){
        double s = 6*sTriangle(a);
        return s;
    }

    public static void main(String[] args) {
   
    }
    
}
