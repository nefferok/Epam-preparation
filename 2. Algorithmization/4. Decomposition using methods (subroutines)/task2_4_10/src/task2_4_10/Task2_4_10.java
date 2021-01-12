package task2_4_10;

public class Task2_4_10 {

    public static int [] figureArr (int n){
        int leng = (int) Math.ceil(Math.log10(Math.abs(n)));
        int [] arr = new int [leng];
        for (int i = 0; i<leng; i++){
            arr[leng-1-i] =(int) ((n/Math.pow(10, i))%10);
        }
        return arr;
    }

    public static void main(String[] args) {

        int n = 1781804674;
        for (int i=0; i< figureArr(n).length; i++){
            System.out.println(figureArr(n)[i]);
        }
    } 
}
