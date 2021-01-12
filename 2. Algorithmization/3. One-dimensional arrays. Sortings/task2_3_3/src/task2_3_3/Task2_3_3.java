package task2_3_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Task2_3_3 {

    /**
     * @param arr
     * @return 
     */
     public static String sortReplace (double[] arr){
        String s ="";
        double max;
        int max_i =0;
        for (int i = 0; i<arr.length;i++){
            max_i = i;
            for (int j = i; j< arr.length; j++){                    
                if (arr[j]>arr[max_i]){
                    max_i = j;
                }
            }
            max = arr[max_i];
            arr[max_i] = arr[i];
            arr[i] = max;                
        }
        for (int i=0; i<arr.length; i++){
            s = s + arr[i] + "; ";
        }
        return s;
        }
 
    public static void main(String[] args) {
        try{      
            String in_n1;
            do {
                in_n1 = JOptionPane.showInputDialog(null, "N1 должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество элементов первого массива N1:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n1.contains(".") || in_n1.startsWith("-")|| in_n1.equals("0"));
            int n1 = Integer.parseInt(in_n1);
        
            double [] a = new double[n1];
            String a_n;
            for (int i = 0; i<n1; i++){
                a_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                        + "А["+(i+1)+ "];", JOptionPane.QUESTION_MESSAGE );
                a[i] = Double.parseDouble(a_n);
            } 
            JOptionPane.showMessageDialog(null, "Новый массив:\n" + sortReplace(a));        
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются целым числом");
            System.out.println(e);

        } catch (NegativeArraySizeException e) {
            JOptionPane.showMessageDialog(null, "Размерность массива не может быть отрицательной");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    } 
}