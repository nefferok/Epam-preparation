package task2_1_2;

import javax.swing.JOptionPane;

public class Task2_1_2 {

    public static void main(String[] args) {
        // Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . 
        // Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
        try{
        
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);

            if (in_n.contains(".") || in_n.startsWith("-")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым и положительным");
            } else {
        
                int n = Integer.parseInt(in_n);
                double [] a = new double [n];
                    for (int i = 0; i<=n-1; i++){
                        String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+i+ "]:", JOptionPane.QUESTION_MESSAGE );
                        a[i] = Double.parseDouble(a_n);
                    }
        
                String in_z = JOptionPane.showInputDialog(null, "Z: ", JOptionPane.QUESTION_MESSAGE);
                double z = Double.parseDouble(in_z);
            
                String s ="";
                int r = 0;
                
                for (int i =0; i<=n-1; i++){
                    if (a[i]>z){
                        a[i]=z;
                        r++;
                    }
                        s = s + a[i] + "; ";
                }
                if (r==0){
                    JOptionPane.showMessageDialog(null, "Исходный массив остался не изменным. Замен нет");
                
                } else {
                    JOptionPane.showMessageDialog(null, "Новый массив: \n" + s + "\nКоличество замен: " + r);
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
