package task2_4_8;

public class Task2_4_8 {

    public static double sum3elem(double arr[], int i){
        if (i==0) {return arr[0]+arr[1];}
        else if (i==arr.length-1) {return arr[arr.length-1] + arr[arr.length-2];}
        else {double sum = arr[i-1]+arr[i]+arr[i+1];
        return sum;
        }
    }
    
    public static double[] arrSum (double arr[], int k, int m){
        double [] arrS =new double[m-k+1];
        int j = 0;
        for (int i = k-1; i<m; i++){
            arrS[j] = sum3elem(arr, i);
            j++;
        }
        return arrS;
        }
  
    public static void main(String[] args) {

        double a [] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i< arrSum(a, 2, 6).length; i++){
            System.out.println(arrSum(a, 2, 6)[i]);
        }
    } 
}
