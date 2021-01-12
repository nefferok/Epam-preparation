package task2_2_15;

import javax.swing.JOptionPane;

public class Task2_2_15 {
    // Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static String maxTo (double [][] arr){
        String s ="";
        double max = arr[0][0];
        for (double[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];  
                }
            }
        }
        for (double[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] % 2 != 0) {
                   arr1[j] = max;  
                }
                s = s + arr1[j] + "; ";
             }
             s = s +"\n";   
        }
        return s;
        }    
    
    public static void main(String[] args) {
        try{
            String in_n;
            String in_m;
            do {
                in_n = JOptionPane.showInputDialog(null, "N должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество строк N:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));

            do {    
                in_m = JOptionPane.showInputDialog(null, "M должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество  столбцов M:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_m.contains(".")|| in_m.startsWith("-") || in_m.equals("0")); 
    
            int n = Integer.parseInt(in_n);
            int m = Integer.parseInt(in_m);
       
            double [][] a = new double [n][m];

            String a_n;

            for (int i = 0; i<n; i++){
                for (int j=0; j<n; j++) {   
                    a_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                            + "А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    a[i][j] = Double.parseDouble(a_n);
                } 
            }
            JOptionPane.showMessageDialog(null, "Новая матрица:\n" + maxTo(a));       
 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются целым числом");
            System.out.println(e);

        } catch (NegativeArraySizeException e) {
            JOptionPane.showMessageDialog(null, "Размерность массива не может быть отрицательной");
            System.out.println(e);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }
}
