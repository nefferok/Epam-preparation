package task5;

import javax.swing.JOptionPane;

public class Task5 {

    public static void main(String[] args) {

        double sum = 0;

        try {
            String in_n = JOptionPane.showInputDialog(null, "Введите количество элементов n", JOptionPane.QUESTION_MESSAGE);

            if (in_n.contains(".") || in_n.startsWith("-")) {
                JOptionPane.showMessageDialog(null, "Число не целое или отрицательное");
            
            } else {

            	int n = Integer.parseInt(in_n);
            	String in_e = JOptionPane.showInputDialog(null, "Веедите чило е: ", JOptionPane.QUESTION_MESSAGE);
            	double e = Double.parseDouble(in_e);
            	for (int i = 1; i<=n; i++){
               	    double a = (1/Math.pow(2, n))+(1/Math.pow(3, n));
                    if (Math.abs(a)>=e){
                        sum = sum + a;
                    }
                }

                JOptionPane.showMessageDialog(null, "Сумма чисел удовлетворяющих условия равна: " + sum);
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
    

