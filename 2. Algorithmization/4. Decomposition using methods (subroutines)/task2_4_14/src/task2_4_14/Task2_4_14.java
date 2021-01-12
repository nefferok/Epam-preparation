package task2_4_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task2_4_14 {
 
    public static void main(String[]args) {
        
        int n = 1000000;
        Set<Integer> armstrongNumbers = new TreeSet<>(Arrays.stream(formArray(n)).boxed().collect(Collectors.toSet()));
        for (int a : armstrongNumbers) {
            if (a != 0)
                System.out.print(a + " ");
        }
    }
 
    public static int[] formArray (int N) {
        ArrayList <Integer> arr = new ArrayList();
        for (int i = 1; i <= N; i++){
                int sum = sum(i);
                if (isArmstrong(sum)) {
                    arr.add(sum);
                }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

    private static boolean isArmstrong(int number) {
        return sum(number) == number;
    }

    public static int sum(int a) {
        int sum = 0;
        int d = (""+a).length();
        int b = a % 10;
        while (a > 0) {
            sum += Math.pow(b, d);
            a /= 10;
            b = a % 10;
        }
        return sum;
    }
}
