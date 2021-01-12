package task3;

import javax.swing.JOptionPane;

public class Task3 {

    public static void main(String[] args) {

       try {

            String in_x1 = JOptionPane.showInputDialog(null, "Введите X1: ", JOptionPane.QUESTION_MESSAGE);
                double x1 = Double.parseDouble(in_x1);
            String in_y1 = JOptionPane.showInputDialog(null, "Введите Y1: ", JOptionPane.QUESTION_MESSAGE);
                double y1 = Double.parseDouble(in_y1);
            String in_x2 = JOptionPane.showInputDialog(null, "Введите X2: ", JOptionPane.QUESTION_MESSAGE);
                double x2 = Double.parseDouble(in_x2);
            String in_y2 = JOptionPane.showInputDialog(null, "Введите Y2: ", JOptionPane.QUESTION_MESSAGE);
                double y2 = Double.parseDouble(in_y2);
            String in_x3 = JOptionPane.showInputDialog(null, "Введите X3: ", JOptionPane.QUESTION_MESSAGE);
                double x3 = Double.parseDouble(in_x3);
            String in_y3 = JOptionPane.showInputDialog(null, "Введите Y3: ", JOptionPane.QUESTION_MESSAGE);
                double y3 = Double.parseDouble(in_y3);
       
            boolean r = ((x1-x2)*(y3-y2))==((y1-y2)*(x3-x2));
                if (r == true) {
                    JOptionPane.showMessageDialog(null, "Точки на одной прямой");
                } else {
                    JOptionPane.showMessageDialog(null, "Точки не на одной прямой");
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
