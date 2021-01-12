package task7;

import javax.swing.JOptionPane;

public class Task7 {

    public static void main(String[] args) {

        try{

            String in_m = JOptionPane.showInputDialog(null, "Введите натуральное m", JOptionPane.QUESTION_MESSAGE);

            if (in_m.contains(".") || in_m.startsWith("-")) {
                JOptionPane.showMessageDialog(null, "Число m не является натуральным");
            } else {
                int m = Integer.parseInt(in_m);
                String in_n = JOptionPane.showInputDialog(null, "Введите натуральное n", JOptionPane.QUESTION_MESSAGE);

            if (in_n.contains(".") || in_n.startsWith("-")){
                JOptionPane.showMessageDialog(null, "Число n не является натуральным");
            } else {
                int n = Integer.parseInt(in_n);
                if (m>=n) {
                    JOptionPane.showMessageDialog(null, "m не может быть больше n!");
                } else {
                    String result = "";
                    for (int i = m; i<=n; i++ ){
                        int r=0;
                        String s = "";
                        String s1 ="";
                    
                            for (int j = 2; j<i; j++){
                                if (i%j==0) {    
                                s = s+ j+ "; ";
                                r++;
                            }
                        } if (r>0) {
                            s1 = "Для числа "+i+" делители: " +s;
                        } else {  
                            s1 =  "Для числа "+i+" делители: отсутствуют";   
                        }
                    result = result + s1 + "\n";
                    }
                JOptionPane.showMessageDialog(null, result);
                }
            }
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
