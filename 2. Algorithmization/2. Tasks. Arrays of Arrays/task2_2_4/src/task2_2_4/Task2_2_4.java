package task2_2_4;

import javax.swing.JOptionPane;

public class Task2_2_4 {

    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество строк и столбцов N", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } 
            int n = Integer.parseInt(in_n);
            int [][] a = new int [n][n];
            String s = "";
            for (int i = 0; i<n; i++){
                if (i%2==0){
                    for (int j = 0; j<n; j++){
                        a[i][j] = j+1;
                        s = s + a[i][j] + " ";
                    }
                } else {
                    for (int j = 0; j<n; j++){
                        a [i][j] = n-j;
                        s = s + a[i][j]+ " ";
                    }
                }
                s = s+"\n";
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