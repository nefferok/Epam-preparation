package task1;

import javax.swing.JOptionPane;

public class Task1 {

    public static void main(String[] args) {

       try {

           String in_a = JOptionPane.showInputDialog(null, "Введите первый угол в градусах: ", JOptionPane.QUESTION_MESSAGE);
           double a = Double.parseDouble(in_a);

           String in_b = JOptionPane.showInputDialog(null, "Введите второй угол в градусах: ", JOptionPane.QUESTION_MESSAGE);
           double b = Double.parseDouble(in_b);
       
           if (a <= 0 || b <= 0 || a + b >= 180) {
               JOptionPane.showMessageDialog(null, "Треугольник не существует");
           } else if ((a + b < 180) && (a != 90 && b != 90 && a + b !=90)) {
               JOptionPane.showMessageDialog(null, "Треугольник существует\nТреугольник не прямоугольный");
           } else if ((a + b < 180) && (a == 90 || b == 90 || a + b ==90)) {
               JOptionPane.showMessageDialog(null, "Треугольник существует\nТреугольник прямоугольный");   
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
