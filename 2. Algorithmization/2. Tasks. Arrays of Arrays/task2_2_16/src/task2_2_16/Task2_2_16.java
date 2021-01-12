package task2_2_16;

import javax.swing.JOptionPane;

public class Task2_2_16 {

    public static void main(String[] args) {
        // Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3,
        //так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        //собой. Построить такой квадрат. 
        
        try{
            String in_n;
            
            do {
                in_n = JOptionPane.showInputDialog(null, "N должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество строк N:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));

            int n = Integer.parseInt(in_n);
            String s = "";

            if (n%2!=0){
            int [][] a = new int [n][n];       
            for (int i = 0; i<n; i++){
                for (int j=0; j<n; j++) {   
                    a[i][j] = 1+((((i+1)+(j+1)-1 + ((n-1)/2))%n)*n)+ (((i+1)+(2*(j+1))+2)%n);
                    s = s + a[i][j] + "; ";
                } 
                s = s +"\n";
            }
            JOptionPane.showMessageDialog(null, "Новая матрица:\n" + s);    
            } else {
            JOptionPane.showMessageDialog(null, "Размерность должна быть нечетной \n");     
            }  

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