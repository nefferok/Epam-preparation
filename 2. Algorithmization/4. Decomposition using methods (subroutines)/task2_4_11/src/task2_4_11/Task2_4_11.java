package task2_4_11;

public class Task2_4_11 {

    public static String figureArr (int a, int b){
        int leng_a = (int) Math.ceil(Math.log10(Math.abs(a)));
        int leng_b = (int) Math.ceil(Math.log10(Math.abs(b)));
        String s;
        if (leng_a > leng_b){
            s = "Первое длинее";
        } else if (leng_a < leng_b){
            s = "Второе длинее";
        } else { s= "Числа равной длины";
        }
        return s;
    }

    public static void main(String[] args) {

        int a = 123421;
        int b = 121313; 
        System.out.println(figureArr(a, b));
    }  
}
