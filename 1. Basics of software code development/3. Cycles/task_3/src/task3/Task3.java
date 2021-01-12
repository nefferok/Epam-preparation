package task3;

import javax.swing.JOptionPane;

public class Task3 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++){ 
            sum = sum + i*i;
        }

        JOptionPane.showMessageDialog(null, "Сумма квадратов чисел от 1 до 100 равна: " + sum);
    }
} 
      
    

