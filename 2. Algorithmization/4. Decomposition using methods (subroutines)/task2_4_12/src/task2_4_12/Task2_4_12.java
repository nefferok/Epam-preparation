package task2_4_12;

public class Task2_4_12 {

    public static int [] arrK_N( int k, int n){
        int leng = k/n;
        if (k%n!=0) leng = leng +1;  
        int [] arr = new int[leng];
        int i = 0;
        while (k>n){
                arr[i] = n;
                k = k-n;
                i++;
        }
        arr[i] = k;
        return arr;
    }

    public static void main(String[] args) {
        int n = 16;
        int k = 4;
        for (int i = 0; i<arrK_N(n, k).length ; i++){
        System.out.println(arrK_N(n, k)[i]);
        }
    }
}
