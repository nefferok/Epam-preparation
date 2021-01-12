package task2_1_1;

import javax.swing.JOptionPane;

public class Task2_1_1 {

    public static void main(String[] args) {

        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым и положительным");
            } else {
        
                int n = Integer.parseInt(in_n);
            
                int[] a = new int [n];
                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+i+ "]:", JOptionPane.QUESTION_MESSAGE );
                    a[i] = Integer.parseInt(a_n);
                }
        
                String in_k = JOptionPane.showInputDialog(null, "К: ", JOptionPane.QUESTION_MESSAGE);
                int k = Integer.parseInt(in_k);
            
                String s ="";
                int r = 0;
                
                for (int i =0; i<=n-1; i++){
                    if (a[i]%k==0){
                        s=s+a[i]+"; ";
                        r++;
                    }
            }   
            if (r==0){
                JOptionPane.showMessageDialog(null, "К не является делителем для элементов массива"); 
            } else {
                JOptionPane.showMessageDialog(null, "Элементы массива делимые на К:\n" + s);
            }
        
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
