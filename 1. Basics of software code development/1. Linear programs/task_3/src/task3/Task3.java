package task3;

import javax.swing.JOptionPane;

public class Task3 {

    public static void main(String[] args) {
                
        try {
            String in_x = JOptionPane.showInputDialog(null, "Ввведите X:", JOptionPane.QUESTION_MESSAGE);
            double x = Double.parseDouble(in_x);
        
            String in_y = JOptionPane.showInputDialog(null, "Ввведите Y:", JOptionPane.QUESTION_MESSAGE);
            double y = Double.parseDouble(in_y);        
        
            double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*(Math.tan(x*y));
            JOptionPane.showMessageDialog(null, "Значение функции =  "+ z); 
        }

        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);
        } 

        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }   
}
