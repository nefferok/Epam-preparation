package task2_2_11;

import javax.swing.JOptionPane;

public class Task2_2_11 {

    public static void main(String[] args) {
        // Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
        //которых число 5 встречается три и более раз.
        
        int n =10;
        int m =20;
        
        String s = "";
        String s_t = "";
        int [][] a = new int [n][m];
        for (int i = 0; i<10; i++){
            int temp = 0;
            for (int j = 0; j<m; j++){
                a[i][j]=(int) (Math.random()*16);
                if (a[i][j]<10){
                    s=s+ "  "+a[i][j] + ";";
                } else {
                    s=s +" "+ a[i][j] + ";";
                } 
                if (a[i][j]==5){
                    temp++;
                }
            }
            s = s + "\n";
            if (temp>=3){
            s_t = s_t + i + "; ";    
            }
        }
        JOptionPane.showMessageDialog(null, "Случайная матрица 10*20: \n" + s + 
                "\nНомера строк строк, где 5 встречается больше 2 раз: " + s_t);
        System.out.println("Случайная матрица 10*20: \n" + s + 
                "\nНомера строк строк, где 5 встречается больше 2 раз: " + s_t);
    } 
}
