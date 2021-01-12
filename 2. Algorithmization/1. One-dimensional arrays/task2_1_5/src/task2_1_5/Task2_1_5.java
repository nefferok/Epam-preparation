package task2_1_5;

import javax.swing.JOptionPane;

public class Task2_1_5 {

    public static void main(String[] args) {
        // Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
        try{
        
            int r =0;
            String s ="";
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            
            if (in_n.contains(".") || in_n.startsWith("-")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым и положительным");
            } else {
                int n = Integer.parseInt(in_n);
                int [] a = new int [n];

                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+i+ "]:", JOptionPane.QUESTION_MESSAGE );
                    if (a_n.contains(".")) {
                        JOptionPane.showMessageDialog(null, "Элементы массива должны быть целыми");
                    } else {
                        a[i] = Integer.parseInt(a_n);
                    }
                }

                for (int i =0; i<=n-1; i++){
                    if (a[i]>i){
                        s = s+ a[i]+ "; ";
                        r++;
                    }
                } 
            }
            if (r==0){
                JOptionPane.showMessageDialog(null, "Массив не содержит искомых элементов");   
            } else {
                JOptionPane.showMessageDialog(null, "Элементы массива удовлетворяющие условию: " + s);
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