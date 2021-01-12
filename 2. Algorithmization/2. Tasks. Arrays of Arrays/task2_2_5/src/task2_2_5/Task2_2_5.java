package task2_2_5;

import javax.swing.JOptionPane;

public class Task2_2_5 {

    public static void main(String[] args) {
        try{    
            String in_n = JOptionPane.showInputDialog(null, "Количество строк и столбцов N", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } 
            int n = Integer.parseInt(in_n);
            int [][] a = new int [n][n];
            String s = "";

            for (int i = 0; i<n; i++){
                for (int j = 0; j<n; j++){
                    if (j<=n-i-1){
                        a[i][j]=i+1;
                    } else {
                        a[i][j] = 0;
                    } 
                    s = s+ a[i][j] + " "; 
                }
                s = s + "\n";
            }
                    
            JOptionPane.showMessageDialog(null, "Массив:\n" + s);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        } 
    }
}