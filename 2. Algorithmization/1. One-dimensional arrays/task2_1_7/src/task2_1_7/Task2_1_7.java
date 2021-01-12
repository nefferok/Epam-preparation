package task2_1_7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Task2_1_7 {

    public static void main(String[] args) {
        
        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } else { 
                int n = Integer.parseInt(in_n);
                double [] a = new double [n];

                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]:", JOptionPane.QUESTION_MESSAGE );
                    a[i] = Double.parseDouble(a_n);
                }
                double max = a[0]+a[0];
                double temp;
                for (int i =0; i<=n-2; i++){
                    int per =i+1;
                    if (n>((2*(per))-1)){
                        temp = (a[i]+a[(2*per - 1)-1]);
                        if (temp > max){
                            max=temp;
                        }
                    } else if (i<=n-2) {
                        temp = a[i]+a[i+1];
                        if (temp >max){
                            max = temp;
                        }
                    }
                } 
                JOptionPane.showMessageDialog(null, "Искомый максимум: " + max);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }
}