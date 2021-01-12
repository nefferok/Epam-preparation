package task2_1_4;

import javax.swing.JOptionPane;

public class Task2_1_4 {

    public static void main(String[] args) {
        //  Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым и положительным");
            } else {
                int n = Integer.parseInt(in_n);
                double [] a = new double [n];
                String s0 = "";
                
                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+i+ "]:", JOptionPane.QUESTION_MESSAGE );
                    a[i] = Double.parseDouble(a_n);
                    s0 =s0 + a[i] + "; ";
                }

                int max = 0;
                int min = 0;
                
                for (int i=1; i<=n-1; i++){
                    if (a[i]> a[max]){
                        max = i;
                    } else if (a[i]< a[min]) {
                        min = i;
                    }
                } 

                if (max == min){
                    JOptionPane.showMessageDialog(null, "Массив А содержит равные элементы");  
                } else {
                    double p_min = a[min];
                    double p_max = a[max];
                
                    String s1 = "";
                    for (int i=0; i<=n-1; i++){
                        if (a[i]==p_min){
                             a[i] = p_max;
                        } else if (a[i]==p_max){
                             a[i]=p_min;
                        }
                        s1 =s1 + a[i]+ "; ";
                    }
                    JOptionPane.showMessageDialog(null, "Первичный массив А: \n" + s0 + "\nНовый массив:\n"+s1);
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
    
