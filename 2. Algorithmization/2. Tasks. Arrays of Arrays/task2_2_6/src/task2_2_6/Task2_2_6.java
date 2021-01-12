package task2_2_6;

import javax.swing.JOptionPane;

public class Task2_2_6 {

    public static void main(String[] args) {
        try{      
            String in_n = JOptionPane.showInputDialog(null, "Количество строк и столбцов N", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } 
            int n = Integer.parseInt(in_n);
            int [][] a = new int [n][n];
            String s = "";
            int k_e = n-1; // переменные показывающие откуда стартует значение 1 и где заканчиваются, для первой строки равны первому и последнему 
            int k_s = 0;       
            for (int i = 0; i<n; i++){
                if (i+1<n/2){ //строки массива делятся на две части, в первой части переменные будут сужаться друг к другу
                    for (int j = 0; j<n; j++){
                        if (j>=k_s && j <= k_e){ //  диапазон значений в строке, где будет 1
                            a[i][j] = 1;   
                        } else {
                            a[i][j] = 0;
                        }
                        s = s + a[i][j]+ " ";
                    }
                    k_e--; // изменение значения диапазона где будет 1 для след. строки
                    k_s++;
                } else  if (i+1==n/2){ // необходимое условие что бы не изменять диапазон, т.к. n-четное
                    for (int j = 0; j<n; j++){
                        if (j>=k_s && j <= k_e){
                            a[i][j] = 1;
                        } else {
                            a[i][j] = 0;
                        }
                        s = s + a[i][j]+ " ";
                    }
                } else {
                    for (int j = 0; j<n; j++){
                        if (j>=k_s && j <= k_e){
                            a[i][j] = 1;
                        } else {
                            a[i][j] = 0;
                        }
                        s = s + a[i][j]+ " ";
                    }
                    k_e++;
                    k_s--;
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
