package task4;

import javax.swing.JOptionPane;

public class Task4 {

    public static void main(String[] args) {
           
        long mul = 1;
        for (long i = 1; i <= 200; i++){ 
            mul = mul * (i*i);
        }
        JOptionPane.showMessageDialog(null, "Произведение квадратов чисел от 1 до 200 равна: " + mul);
    }
}
    
