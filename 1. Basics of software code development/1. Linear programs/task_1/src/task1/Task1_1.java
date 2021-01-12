package task1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Task1_1 {


    public static void main(String[] args) {
       
    	String in_a;
    	String in_b;
    	String in_c;
    
	   try {

	       in_a = JOptionPane.showInputDialog(null, "", JOptionPane.QUESTION_MESSAGE);
    	       double a = Double.parseDouble(in_a);

               in_b = JOptionPane.showInputDialog(null, "", JOptionPane.QUESTION_MESSAGE);
               double b = Double.parseDouble(in_b);
    
               in_c = JOptionPane.showInputDialog(null, "", JOptionPane.QUESTION_MESSAGE);
               double c = Double.parseDouble(in_c);
    
               double result = (((a-3)*b)/2) + c;
               JOptionPane.showMessageDialog(null, "z = ((a-3)*b/2)+c : "+ result);
          } catch (Exception e){ System.out.println(e);}
    }
}
    
