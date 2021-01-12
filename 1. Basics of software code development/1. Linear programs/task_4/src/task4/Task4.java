package task4;

import javax.swing.JOptionPane;

public class Task4 {

    public static void main(String[] args) {

        try {
            String in = JOptionPane.showInputDialog(null, "Введите чилсо в формате nnn.ddd", JOptionPane.QUESTION_MESSAGE);
            if(in.length()==7 && in.indexOf(".")==3){
            double f = Double.parseDouble(in);
            double result = (f * 1000) % 1000 + (int) f / 1000.0;
            JOptionPane.showMessageDialog(null, "Ответ: "+result);
        
	// Вариант 2
        /*
        try {
            String in_n = JOptionPane.showInputDialog(null, "Введите целочисленное N от 0 до 9", JOptionPane.QUESTION_MESSAGE);
            String in_d = JOptionPane.showInputDialog(null, "Введите целочисленное D от 0 до 9", JOptionPane.QUESTION_MESSAGE);
        
            if (in_n.length()==1 && in_d.length()==1) {
            String fig = in_n+in_n+in_n+"."+in_d+in_d+in_d;
            double f = Double.parseDouble(fig);
            
            double result = (f * 1000) % 1000 + (int) f / 1000.0;
            JOptionPane.showMessageDialog(null, "Ответ: "+result);
        */     
   
         } else {

            JOptionPane.showMessageDialog(null, "Неверный формат Y или X", "Error",
                                  JOptionPane.ERROR_MESSAGE);}
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
