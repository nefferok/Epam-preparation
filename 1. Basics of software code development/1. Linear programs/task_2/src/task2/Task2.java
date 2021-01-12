package task2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Task2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
       	    String in_a = JOptionPane.showInputDialog(null, "Ввведите а:", JOptionPane.QUESTION_MESSAGE);
                double a = Double.parseDouble(in_a);
        
	    String in_b = JOptionPane.showInputDialog(null, "Ввведите b:", JOptionPane.QUESTION_MESSAGE);
                double b = Double.parseDouble(in_b);        
        
	    String in_c = JOptionPane.showInputDialog(null, "Ввведите c:", JOptionPane.QUESTION_MESSAGE);
                double c = Double.parseDouble(in_c);
        
	    if (a==0){
 
               JOptionPane.showMessageDialog(null, "a не может быть равно 0, т.к. делить на ноль не возможно");
   
            }  else if (b==0){
           
               JOptionPane.showMessageDialog(null, "b не может быть равно 0, т.к. делить на ноль не возможно");
            
            }  else if ((Math.pow(b, 2)+(4*a*c))<0){

               JOptionPane.showMessageDialog(null, "Ошибка, отрицательное число под корнем");

            }  else { 
            
               double z = ((b+(Math.sqrt(Math.pow(b, 2)+(4*a*c))))/(2*a))-(Math.pow(a, 3)*c)+Math.pow(b, -2);
               JOptionPane.showMessageDialog(null, "Значение функции z =  "+ z);
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
