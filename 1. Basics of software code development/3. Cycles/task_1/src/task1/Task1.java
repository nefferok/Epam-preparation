package task1;

import javax.swing.JOptionPane;

public class Task1 {

    public static void main(String[] args) {

        try {

            String in_n = JOptionPane.showInputDialog(null, "Введите целое положительное число", JOptionPane.QUESTION_MESSAGE);

            if (in_n.contains(".") || in_n.startsWith("-")) {

                JOptionPane.showMessageDialog(null, "Число не целое или отрицательное");

            } else {
                int n = Integer.parseInt(in_n);
                int sum = 0;
                for (int i = 1; i <= n; i++){ 
                sum = sum + i;
            }

            JOptionPane.showMessageDialog(null, "Сумма чисел от 1 до "+ n + " равна: " + sum);

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
