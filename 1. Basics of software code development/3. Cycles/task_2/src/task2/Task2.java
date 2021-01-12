package task2;

import javax.swing.JOptionPane;

public class Task2 {

    public static void main(String[] args) {

       try {

           String in_a = JOptionPane.showInputDialog(null, "Начало отрезка А: ", JOptionPane.QUESTION_MESSAGE);
               double a = Double.parseDouble(in_a);
           String in_b = JOptionPane.showInputDialog(null, "Конец отрезка В: ", JOptionPane.QUESTION_MESSAGE);
               double b = Double.parseDouble(in_b);
           String in_h = JOptionPane.showInputDialog(null, "Шаг функции H: ", JOptionPane.QUESTION_MESSAGE);
               double h = Double.parseDouble(in_h);
            
           String ans = "";
            
           if (b < a || h > Math.abs(a-b)){
               JOptionPane.showMessageDialog(null, " Данные не корректные ");
           
           } else {
               for (double x = a; x<=b; x = x + h){
                   if (x<=2) {
                       ans = ans + -x + "; ";
                   } else {
                       ans = ans + x + "; ";
                   }
               }
            
           JOptionPane.showMessageDialog(null, "Значения функции: \n" + ans);
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