package task2_1_3;

import javax.swing.JOptionPane;

public class Task2_1_3 {

    public static void main(String[] args) {
        // Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        //положительных и нулевых элементов.
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

                int pos = 0;
                int neg = 0;
                int z = 0;
                
                for (int i =0; i<=n-1; i++){
                    if (a[i]>0){
                        pos++;
                    } else if  (a[i] == 0) {
                        z++;
                    } else {
                        neg++;
                    }
                }

                JOptionPane.showMessageDialog(null, "Массив А содержит: \n" + pos + " - положительных числа; \n" + neg +" - отрицательных числа; \n"+ z+" - нолей;");
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