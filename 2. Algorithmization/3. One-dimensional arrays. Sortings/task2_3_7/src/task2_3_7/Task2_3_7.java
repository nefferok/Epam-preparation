package task2_3_7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Task2_3_7 {

    public static void main(String[] args) {

        try{

            String in_n1;
            String in_n2;

            do {
                in_n1 = JOptionPane.showInputDialog(null, "N1 должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество элементов первого массива N1:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n1.contains(".") || in_n1.startsWith("-")|| in_n1.equals("0"));
            int n1 = Integer.parseInt(in_n1);

            do {
                in_n2 = JOptionPane.showInputDialog(null, "N2 должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество элементов вторго массива N2:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n2.contains(".") || in_n2.startsWith("-")|| in_n2.equals("0"));
            int n2 = Integer.parseInt(in_n2);

            ArrayList <Double> arr1 = new ArrayList();
            ArrayList <Double> arr2 = new ArrayList();

            String a_n;
            String b_n;

            for (int i = 0; i<n1; i++){
                a_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                        + "А["+(i+1)+ "];", JOptionPane.QUESTION_MESSAGE );
                arr1.add(Double.parseDouble(a_n));
            }

            for (int i = 0; i<n2; i++){
                b_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                        + "B["+(i+1)+ "];", JOptionPane.QUESTION_MESSAGE );
                arr2.add(Double.parseDouble(b_n));
            }
            String s = "";

            for (int i = 0; i<arr2.size(); i++){
                s = s + (binarySearch(arr1, arr2.get(i))+1) + "; ";
                arr1.add(binarySearch(arr1, arr2.get(i)), arr2.get(i));
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
