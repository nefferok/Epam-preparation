package task5;

import javax.swing.JOptionPane;

public class Task5 {

    public static void main(String[] args) {
 
        try {
            String t = JOptionPane.showInputDialog(null, "Введите время в секундах Т: ", JOptionPane.QUESTION_MESSAGE);
            
            long sec = Long.parseLong(t);
            int ss = (int) (sec % 60);
            int mm =  (int) ((sec-ss)/60)%60;
            int hh = (int) (sec/3600);
         
            JOptionPane.showMessageDialog(null, "Время: " + hh + "ч " + mm + "мин " +ss+"сек");
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch NullPointerException e1) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e1);
        }
    }
}
