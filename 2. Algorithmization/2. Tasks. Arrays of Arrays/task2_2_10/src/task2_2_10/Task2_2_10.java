package task2_2_10;

import javax.swing.JOptionPane;

public class Task2_2_10 {
    public static void main(String[] args) {
        // Найти положительные элементы главной диагонали квадратной матрицы.
        try{
            String in_n;
            do {
                in_n = JOptionPane.showInputDialog(null, "N должно быть целым, положительным и больше 0!!!\n"
                        + "Введите размерность N:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));  

            int n = Integer.parseInt(in_n);
            double [][] a = new double [n][n];
            String a_n;
            for (int i = 0; i<n; i++){
                for (int j=0; j<n; j++) {   
                    a_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                            + "А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    a[i][j] = Double.parseDouble(a_n);
                } 
            }
            String s="Положительные элементы главной диагонали: \n";
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    if (i==j && a[i][j]>0){
                    s = s + "A["+(i+1)+"]["+(j+1)+"] - " +a[i][j]+ ";\n";
                    }
                }
            }
            JOptionPane.showMessageDialog(null, s);

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