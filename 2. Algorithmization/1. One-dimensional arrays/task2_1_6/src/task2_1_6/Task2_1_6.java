package task2_1_6;

import javax.swing.JOptionPane;

public class Task2_1_6 {

    public static void main(String[] args) {
        // Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
        // являются простыми числами.
        try{

            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } else {
                int r;
                int n = Integer.parseInt(in_n);
                double [] a = new double [n];
                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]:", JOptionPane.QUESTION_MESSAGE );
                    a[i] = Double.parseDouble(a_n);
                }                       
                double sum=0;
                for (int i =0; i<=n-1; i++){
                    r = 0;
                    for (int j=2; j<=(i+1); j++){
                        if ((i+1)%j == 0){
                            r++;}
                        }                         
                        if (r==1){
                           sum = sum + a[i];
                        }
                    }
                 if (sum==0){
                     JOptionPane.showMessageDialog(null, "Массив не содержит искомых элементов");   
                 } else {
                     JOptionPane.showMessageDialog(null, "Сумма элементов последовательности: " + sum);
                 }
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
