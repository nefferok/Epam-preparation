package task2_2_2;

import javax.swing.JOptionPane;

public class Task2_2_2 {

    public static void main(String[] args) {
        //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        try{    
            String in_n = JOptionPane.showInputDialog(null, "Количество строк и столбцов N", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } 
            int n = Integer.parseInt(in_n);
            int [][] a = new int [n][n];
            for (int i = 0; i<n; i++){
                for (int j=0; j<n; j++) {
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    if (a_n.contains(".")){
                        JOptionPane.showMessageDialog(null, "Элементы массива должны быть целыми");
                    break;
                    }
                a[i][j] = Integer.parseInt(a_n);
                }
            }
            String s1 = "";
            String s2 = "";
            int k = n-1;
            for (int i=0; i<n; i++){
                for (int j =0; j<n; j++){
                    if (i==j){
                        s1 = s1 + a[i][j] + " "; 
                    } 
                }
            s2 = s2 + a[i][k] + " ";
            k--;
            }
            JOptionPane.showMessageDialog(null, "Элементы главной диагонали:\n" + s1 + "\nЭлементы на второй диагонали: \n" + s2);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }
}