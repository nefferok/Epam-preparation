package task2_2_8;

import javax.swing.JOptionPane;

public class Task2_2_8 {

    public static void main(String[] args) {
        // В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        //пользователь с клавиатуры
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
            double [][] a = new double [n][m];

            for (int i = 0; i<n; i++){
                for (int j=0; j<m; j++) {
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    a[i][j] = Double.parseDouble(a_n);                 
                }
            }
            String in_k = JOptionPane.showInputDialog(null, "Столбец К:", JOptionPane.QUESTION_MESSAGE);
                if (in_k.contains(".") || in_k.startsWith("-")|| in_k.equals("0")) {
                    JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
                } 
            String in_p = JOptionPane.showInputDialog(null, "Столбец Р", JOptionPane.QUESTION_MESSAGE);
                if (in_p.contains(".") || in_p.startsWith("-")|| in_p.equals("0")) {
                    JOptionPane.showMessageDialog(null, "M должно быть целым, положительным и больше 0");
                }
            int k = Integer.parseInt(in_k);
            int p = Integer.parseInt(in_p);
            if (k>m||p>m){
                JOptionPane.showMessageDialog(null, "K или М больше размерности массива");
            } else {  
                double temp;
                for (int i = 0; i< n; i++){
                    temp = a[i][k-1];
                    a[i][k-1]=a[i][p-1];
                    a[i][p-1] = temp;
                }    
                String s = "";
                for (int i =0; i<n; i++){
                    for (int j =0; j<m; j++){
                        s = s+ a[i][j]+ " ";
                    }
                    s = s + "\n";
                }
                        
                JOptionPane.showMessageDialog(null, "Строка К:\n" + s);      
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