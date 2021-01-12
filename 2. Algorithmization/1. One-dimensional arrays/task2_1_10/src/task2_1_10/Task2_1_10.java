package task2_1_10;

import javax.swing.JOptionPane;

public class Task2_1_10 {

    public static void main(String[] args) {
        try{       
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } else {       
                int n = Integer.parseInt(in_n);
                int [] a = new int [n];
                String s_in = "";
                String s_out ="";

                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]:", JOptionPane.QUESTION_MESSAGE );

                    if (a_n.contains(".")){
                        JOptionPane.showMessageDialog(null, "Элементы массива должны быть целыми");
                    }
                    a[i] = Integer.parseInt(a_n);
                    s_in = s_in+ a[i] + "; ";
                }

                for (int i=0; i<n; i++){
                    if (i%2 != 0){
                        a[i] = 0;
                    }
                    s_out = s_out + a[i]+ "; ";
                } 
            JOptionPane.showMessageDialog(null, "Исходный массив:\n" + s_in + "\n" +"Новый массив:\n" + s_out);
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