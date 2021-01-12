package task2_2_13;

import javax.swing.JOptionPane;

public class Task2_2_13 {

        public static String sortMinToMax (double [][] arr){
            String s ="";
            for (int j = 0; j<arr[0].length; j++){
                for (int i = arr.length-1; i>=0; i--){
                   for (int k = 0; k<i; k++){
                       if(arr[k][j]>arr[k+1][j]){
                           double temp = arr[k][j];
                           arr[k][j]=arr[k+1][j];
                           arr[k+1][j]=temp;                              
                        }
                    }
                }
            }
            for (double[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    s = s + arr1[j] + "; ";   
                }
                s = s +"\n";
            }
            return s;
        }  
  
        public static String sortMaxToMin (double [][] arr){
            String s =""; 
            for (int j = 0; j<arr[0].length; j++){
                for (int i = arr.length-1; i>=0; i--){
                   for (int k = 0; k<i; k++){
                       if(arr[k][j]<arr[k+1][j]){
                           double temp = arr[k][j];
                           arr[k][j]=arr[k+1][j];
                           arr[k+1][j]=temp;                              
                        }
                    }
                }
            }
            for (double[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    s = s + arr1[j] + "; ";   
                }
                s = s +"\n";
            }
        return s;                  
        }
    
    
    public static void main(String[] args) {
        try{
            String in_n;
            String in_m;
            do {
                in_n = JOptionPane.showInputDialog(null, "N должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество строк N:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));
        
            do {    
                in_m = JOptionPane.showInputDialog(null, "M должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество  столбцов M:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_m.contains(".")|| in_m.startsWith("-") || in_m.equals("0")); 
    
            int n = Integer.parseInt(in_n);
            int m = Integer.parseInt(in_m);   
            double [][] a = new double [n][m];
            String a_n;

            for (int i = 0; i<n; i++){
                for (int j=0; j<n; j++) {   
                    a_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                            + "А["+(i+1)+ "]["+(j+1)+"];", JOptionPane.QUESTION_MESSAGE );
                    a[i][j] = Double.parseDouble(a_n);
                } 
            }
            JOptionPane.showMessageDialog(null, "Строки по возпастанию:\n" + sortMinToMax(a)+
                    "\nСтроки по убыванию:\n" + sortMaxToMin(a));    
         
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
