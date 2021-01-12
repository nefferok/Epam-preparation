package task8;

import javax.swing.JOptionPane;

public class Task8 {

    public static void main(String[] args) {
      
       String in_a = JOptionPane.showInputDialog(null, "Введите A: ", JOptionPane.QUESTION_MESSAGE);
       String in_b = JOptionPane.showInputDialog(null, "Введите B: ", JOptionPane.QUESTION_MESSAGE);
       String s ="";
       int r = 0;

       for (int i = 0; i < in_a.length()-1; i++ ){
           char a = in_a.charAt(i);
           for (int j = 0; j < in_b.length()-1; j++){
               char b = in_b.charAt(j);
               if (a==b){
               s = s + a +"; ";
               r++;
               }
           }
       }
       if (r > 0) {
           JOptionPane.showMessageDialog(null, "Одинаковые цифры в двух числах: "+s);
       } else {
           JOptionPane.showMessageDialog(null, "В числах нет одинаковых цифр");
       }
    }
}


    
    

