package task6;

import javax.swing.JOptionPane;

public class Task6 {

    public static void main(String[] args) {

        String in = JOptionPane.showInputDialog(null, "Ввод символа: ", JOptionPane.QUESTION_MESSAGE);
        
        if (in.length()>1) {
            JOptionPane.showMessageDialog(null, "Введите ОДИН символ!");
        } else {
            char c = in.charAt(0);
            int ans = (int) c;
            System.out.println("Код символа '" +c+ "' является:"  +ans);
        }
    }
}
