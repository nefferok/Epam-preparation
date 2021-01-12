package task2_1_8;

import javax.swing.JOptionPane;

public class Task2_1_8 {

    public static void main(String[] args) {
        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } else { 
                int n = Integer.parseInt(in_n);
                int [] a = new int [n];
                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]:", JOptionPane.QUESTION_MESSAGE );
                    if (a_n.contains(".")){
                        JOptionPane.showMessageDialog(null, "Элементы массива должны быть целыми");
                    }
                    a[i] = Integer.parseInt(a_n);
                }

                int min = a[0];
                int r = 0;
                for (int i =0; i<=n-1; i++){
                    if (a[i]<min){
                        min = a[i];
                        r++;
                    }
                }

                int [] b = new int [n-r];
                int j = 0;
                for (int i = 0; i<=n-1; i++){
                    if (a[i] != min){
                        b[j] = a[i];
                        j++;
                    }
                } 
                String s = "";
                for (int i=0; i<=j-1; i++){
                    s = s+ b[i] + "; ";
                } 
           JOptionPane.showMessageDialog(null, "Новый массив: " + s);
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