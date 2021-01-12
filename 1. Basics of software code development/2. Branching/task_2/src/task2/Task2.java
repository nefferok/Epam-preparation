package task2;

import javax.swing.JOptionPane;

public class Task2 {

    public static void main(String[] args) {

       try {

           String in_a = JOptionPane.showInputDialog(null, "Введите A: ", JOptionPane.QUESTION_MESSAGE);
               double a = Double.parseDouble(in_a);

           String in_b = JOptionPane.showInputDialog(null, "Введите B: ", JOptionPane.QUESTION_MESSAGE);
               double b = Double.parseDouble(in_b);

           String in_c = JOptionPane.showInputDialog(null, "Введите C: ", JOptionPane.QUESTION_MESSAGE);
               double c = Double.parseDouble(in_c);

           String in_d = JOptionPane.showInputDialog(null, "Введите D: ", JOptionPane.QUESTION_MESSAGE);
               double d = Double.parseDouble(in_d);
       
           double max = Math.max(Math.min(a, b), Math.min(c, d));

           JOptionPane.showMessageDialog(null, "Значуение функции :" + max);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }   
}
