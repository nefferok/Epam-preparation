package task6;

import javax.swing.JOptionPane;

public class Task6 {

    public static void main(String[] args) {
        
        try {

            String in_x = JOptionPane.showInputDialog(null, "Введите Х:", JOptionPane.QUESTION_MESSAGE);
            double x = Double.parseDouble(in_x);
        
            String in_y = JOptionPane.showInputDialog(null, "Введите Y:", JOptionPane.QUESTION_MESSAGE);
            double y = Double.parseDouble(in_y);

            if ((y >= 0 && y<4 && x <= 2 && x >=-2)||(y<=0 && y>=-3 && x>=-4 && x<=4)) {
            JOptionPane.showMessageDialog(null, "Точка входит в область");
        
            } else {
                JOptionPane.showMessageDialog(null, "Точка не входит в область");
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
