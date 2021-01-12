package task2_3_6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Task2_3_6 {
    
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

            sort (a);

            String s = "";
            for (int i = 0; i<a.length; i++){
                s =s+  a[i]+"; ";
            }

            JOptionPane.showMessageDialog(null, "Новый массив:\n" + s);

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
    
    public static void swap(double [] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort(double [] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }

    private static void hSort(double [] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }
}
