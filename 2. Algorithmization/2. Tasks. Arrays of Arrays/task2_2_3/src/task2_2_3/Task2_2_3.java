package task2_2_3;

import javax.swing.JOptionPane;

public class Task2_2_3 {

    public static void main(String[] args) {
        // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество строк N", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } 
            String in_m = JOptionPane.showInputDialog(null, "Количество  столбцов M", JOptionPane.QUESTION_MESSAGE);
            if (in_m.contains(".") || in_m.startsWith("-")|| in_m.equals("0")) {
                JOptionPane.showMessageDialog(null, "M должно быть целым, положительным и больше 0");
            }    
            int n = Integer.parseInt(in_n);
            int m = Integer.parseInt(in_m);
            int [][] a = new int [n][m];

            for (int i = 0; i<n; i++){
                for (int j=0; j<m; j++) {
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    if (a_n.contains(".")){
                        JOptionPane.showMessageDialog(null, "Элементы массива должны быть целыми");
                    break;
                    }
                    a[i][j] = Integer.parseInt(a_n);                    
                }
            }

            String in_k = JOptionPane.showInputDialog(null, "Строка К:", JOptionPane.QUESTION_MESSAGE);
                if (in_k.contains(".") || in_k.startsWith("-")|| in_k.equals("0")) {
                    JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
                } 
            String in_p = JOptionPane.showInputDialog(null, "Столбец Р", JOptionPane.QUESTION_MESSAGE);
                if (in_p.contains(".") || in_p.startsWith("-")|| in_p.equals("0")) {
                    JOptionPane.showMessageDialog(null, "M должно быть целым, положительным и больше 0");
                }
            int k = Integer.parseInt(in_k);
            int p = Integer.parseInt(in_p);

            if (k>n||p>m){
                JOptionPane.showMessageDialog(null, "K или М больше размерности массива");
            } else {   
                String s1 = "";
                String s2 = "";
                for (int j =0; j<m; j++){
                    s1 = s1+ a[k-1][j]+ " ";
                }
                for (int i =0; i<n; i++){
                     s2 = s2 + a[i][p-1]+ "\n";
                }   
                JOptionPane.showMessageDialog(null, "Строка К:\n" + s1 +"\nСтолбуц P:\n" +s2);       
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