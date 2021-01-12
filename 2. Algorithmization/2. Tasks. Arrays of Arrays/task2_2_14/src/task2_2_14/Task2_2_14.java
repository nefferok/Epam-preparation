package task2_2_14;

import javax.swing.JOptionPane;

public class Task2_2_14 {

    public static void main(String[] args) {
        // Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        //единиц равно номеру столбца.
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
            int [][] a = new int [n][m];
            int temp;
            for (int j = 0; j < m; j++){
            	do {
                    temp=0;
               	    for (int i = 0; i<n; i++){
                        if (temp == j+1){
                            a[i][j] = 0; 
                        }
                        if (temp< j+1){
                            a[i][j] = (int) (Math.random()*2);
                            if (a[i][j] == 1){
                            temp++;
                            }
                        }
                    }
                } while (temp!=j+1);
            }
            String s ="";
            for (int i = 0; i<n; i++){
                for (int j = 0; j < m; j++){
                    s = s + a[i][j] + "; ";   
                }
                s = s +"\n";
            }

            JOptionPane.showMessageDialog(null, "Строки по возпастанию:\n" + s);    
        
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
