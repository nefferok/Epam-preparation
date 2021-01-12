package task4;

import javax.swing.JOptionPane;

public class Task4 {

    public static void main(String[] args) {

       try {

           String in_a = JOptionPane.showInputDialog(null, "Размер отверстия А: ", JOptionPane.QUESTION_MESSAGE);
               double a = Double.parseDouble(in_a);
           String in_b = JOptionPane.showInputDialog(null, "Размер отверстия В ", JOptionPane.QUESTION_MESSAGE);
               double b = Double.parseDouble(in_b);
           String in_x = JOptionPane.showInputDialog(null, "Размер кирпича X: ", JOptionPane.QUESTION_MESSAGE);
               double x = Double.parseDouble(in_x);
           String in_y = JOptionPane.showInputDialog(null, "Размер кирпича Y: ", JOptionPane.QUESTION_MESSAGE);
               double y = Double.parseDouble(in_y);
           String in_z = JOptionPane.showInputDialog(null, "Размер кирпича Z: ", JOptionPane.QUESTION_MESSAGE);
               double z = Double.parseDouble(in_z);

           boolean res;
       
           if (x<=0 || y<=0 || z<=0 || a<=0 || b<=0){
               JOptionPane.showMessageDialog(null, "Неверные данные"); 

           } else if (x<a && x<b && y<b && y<a) { 
               JOptionPane.showMessageDialog(null, "Кирпич пройдет");

           } else if (x<a && x<b && z<b && z<a) {
               JOptionPane.showMessageDialog(null, "Кирпич пройдет");

           } else if (y<a && y<b && z<b && z<a){
               JOptionPane.showMessageDialog(null, "Кирпич пройдет");

           } else JOptionPane.showMessageDialog(null, "Кирпич не пройдет");
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }  
}
