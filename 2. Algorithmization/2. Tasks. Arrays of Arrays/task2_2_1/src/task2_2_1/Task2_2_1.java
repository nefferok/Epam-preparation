
package task2_2_1;

import javax.swing.JOptionPane;

public class Task2_2_1 {

    public static void main(String[] args) {
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

           String s = "";
           for (int i=0; i<n; i++){
               for (int j =0; j<m; j++){
                   if (j%2 != 0 && a[0][j]>a[n-1][j]){
                       s = s + a[i][j] + " "; 
                   } 
               } if (!"".equals(s)){
                   s = s + "\n";
               }
           }
           JOptionPane.showMessageDialog(null, "Искомый массив:\n" + s);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются числом");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }
}
    

