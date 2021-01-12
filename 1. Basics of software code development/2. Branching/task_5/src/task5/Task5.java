package task5;

import javax.swing.JOptionPane;

public class Task5 {

    public static void main(String[] args) {

            try {

                String in_x = JOptionPane.showInputDialog(null, "Значение X: ", JOptionPane.QUESTION_MESSAGE);
                double x = Double.parseDouble(in_x);
                double f;

                if (x<=3){
                    f = x*x - 3*x + 9;
                } else f = 1/(Math.pow(x, 3)+6);
        
                JOptionPane.showMessageDialog(null, "Значение функции равно: "+f);
      
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }  
}
