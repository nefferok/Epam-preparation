package task2_3_8;

import javax.swing.JOptionPane;

public class Task2_3_8 {

    public static void main(String[] args) {

        try{
            String in_n;
            do {
                in_n = JOptionPane.showInputDialog(null, "N1 должно быть целым, положительным и больше 0!!!\n"
                        + "Количество дробей:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));
            int n = Integer.parseInt(in_n);

            int [][] arr = new int [n][2];
            int [][] arr_s = new int [n][2];
            String st = "Начальная последовательность дробей: \n";
            String a_n;
            for (int i = 0; i<n; i++){
                a_n = JOptionPane.showInputDialog(null, "Введите дробь через '/' "
                        + "А["+(i+1)+ "];", JOptionPane.QUESTION_MESSAGE );
                arr_s [i][0] = arr[i][0] = Integer.parseInt(a_n.substring(0, a_n.indexOf("/")));
                arr_s [i][1] = arr[i][1] = Integer.parseInt(a_n.substring(a_n.indexOf("/")+1));
                st = st + arr_s[i][0]+"/"+arr_s[i][1]+ "; ";
            }
            
            for (int i = 0; i < n-1; i++ ){
                frac (arr [i], arr [i+1]);
            }
            for (int i = n-2; i > 0; i-- ){
                frac (arr [i-1], arr [i]);
            }
            sortReplaceTwo(arr, arr_s);

            String st_o = "Дроби по возрастанию с общим знаменателем: \n";
            String st_s = "Начальные дроби по возрастанию: \n";
            for (int i = 0; i<n; i++){
                st_o = st_o + arr[i][0]+"/"+arr[i][1]+"; ";
                st_s = st_s + arr_s[i][0]+"/"+arr_s[i][1]+"; ";
            }

            JOptionPane.showMessageDialog(null, st +"\n"+st_o +"\n"+st_s );
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются целым числом");
            System.out.println(e);
        }
        catch (NegativeArraySizeException e) {
            JOptionPane.showMessageDialog(null, "Размерность массива не может быть отрицательной");
            System.out.println(e);
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }

    public static int gcd (int a, int b){
        return b==0 ? a : gcd (b, a%b);

    }
    
    public static int lcm (int a, int b){
        return a  / gcd(a,b) * b;

    }
    
    public static void frac (int [] arr1, int [] arr2){
        int lcm = lcm (arr1[1], arr2 [1]);
        int dm1= lcm / arr1[1];
        int dm2= lcm / arr2[1];
        arr1[0] = arr1[0]*dm1;
        arr2[0] = arr2[0]*dm2;
        arr1[1]=lcm;
        arr2[1]=lcm;
    }
    
    public static void sortReplace (int[][] arr){
        String s ="";
        int [][] max = new int[1][1];
        int max_i =0;
        for (int i = 0; i<arr.length;i++){
            max_i = i;
            for (int j = i; j< arr.length; j++){

                if (arr[j][0]<arr[max_i][0]){
                    max_i = j;
                }
            }
            max[0] = arr[max_i];
            arr[max_i] = arr[i];
            arr[i] = max [0];
        }
    }
    
    public static void sortReplaceTwo (int[][] arr, int [][]arr2){
        String s ="";
        int [][] max = new int[1][1];
        int max_i =0;
        for (int i = 0; i<arr.length;i++){
            max_i = i;
            for (int j = i; j< arr.length; j++){

                if (arr[j][0]<arr[max_i][0]){
                    max_i = j;
                }
            }
            max[0] = arr[max_i];
            arr[max_i] = arr[i];
            arr[i] = max [0];

            max[0] = arr2[max_i];
            arr2[max_i] = arr2[i];
            arr2[i] = max [0];
        }
    }
}
