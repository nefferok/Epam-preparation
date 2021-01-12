package task2_3_5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Task2_3_5 {
    
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

            ArrayList <Double> arr = new ArrayList();
            arr.add(a[0]);
            for (int i = 1; i <= 2; i++){
                int j=0;
                if (arr.get(j)>= a[i]){
                    arr.add(j, a[i]);

                } else {
                    arr.add(j+1, a[i]);
                }
            }

            for (int i =3; i<a.length; i++){
                arr.add(binarySearch(arr, a[i]), a[i]);
            }
            String s = "";
            for (int i = 0; i<arr.size(); i++){
                s =s+  arr.get(i)+"; ";
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

    public static int binarySearch(ArrayList <Double> arr, double el) {

        int f = 0, l = arr.size()-1, k = -1;

        while (l > f){
            int mid = (l+f)/2;
            if (arr.get(0)>=el){
                k = 0;
                break;
            }
            if (arr.get(arr.size()-1)<=el){
                k = arr.size();
                break;
            }
            if (arr.get(mid)<=el && arr.get(mid+1)>=el){
                k = mid+1;
                break;
            } else {
                if (el < arr.get(mid)){
                    l=mid;
                } else {
                    f = mid+1;
                }
            }

        }
        return k;
    }
}