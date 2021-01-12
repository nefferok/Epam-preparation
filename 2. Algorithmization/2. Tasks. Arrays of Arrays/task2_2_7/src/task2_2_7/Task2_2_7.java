package task2_2_7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Task2_2_7 {

    public static void main(String[] args) {
        try{        
            String in_n = JOptionPane.showInputDialog(null, "Количество строк и столбцов N", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            }
            int n = Integer.parseInt(in_n);
            double [][] a = new double [n][n];
            String s = "";
            int r = 0;
            double k;

            for (int i = 0; i<n; i++){
                for (int j = 0; j<n; j++){             
                    k = Math.sin((Math.pow(i, 2)-Math.pow(j, 2))/n);
                    double k1 = new BigDecimal(k).setScale(2, RoundingMode.UP).doubleValue();
                    a[i][j] = k1;
                    if (a[i][j]>0){
                        r++;
                    }
                    s = s+ a[i][j] + "; "; 
                }
                s = s + "\n";
            }       
            JOptionPane.showMessageDialog(null, "Массив:\n" + s+ "\nПоложительных элементов: " +r);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        } 
    }   
}