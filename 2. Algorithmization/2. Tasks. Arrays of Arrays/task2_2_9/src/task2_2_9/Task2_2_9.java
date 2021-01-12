package task2_2_9;

import javax.swing.JOptionPane;

public class Task2_2_9 {

    public static void main(String[] args) {
        // Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
        //столбец содержит максимальную сумму.
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
            double [] b = new double [m];
            String a_n;
            for (int i = 0; i<n; i++){
                for (int j=0; j<m; j++) {
                    do {    
                    a_n = JOptionPane.showInputDialog(null, "Элементы массива должны быть положительными"
                            + "\nВведите элемент массива А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    } while (a_n.startsWith("-"));
                    a[i][j] = Double.parseDouble(a_n);
                } 
            }
            int max = 0;
            String s="";
            for (int j=0; j<m; j++){   
                for (int i=0; i<n; i++){
                    b[j]=b[j]+a[i][j];
                }
                s = s + "Сумма элементов столбца " + (j+1) + " равна: " + b[j] + ";\n";
                if (b[j]>b[max]){
                    max=j;
                }
            }
            JOptionPane.showMessageDialog(null, s + "Наибольшая сумма элементов в столбце: " + (max+1));
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