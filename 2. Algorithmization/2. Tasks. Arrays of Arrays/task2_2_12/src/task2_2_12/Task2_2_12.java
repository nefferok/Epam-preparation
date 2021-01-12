package task2_2_12;

import javax.swing.JOptionPane;

public class Task2_2_12 {

        public static String sortMinToMax (double [][] arr){
            String s ="";
            String s_ans="";
            for (int i = 0; i<arr.length; i++){
                for (int j = arr[i].length-1; j>=0; j--){
                   for (int k = 0; k<j; k++){
                       if(arr[i][k]>arr[i][k+1]){
                           double temp = arr[i][k];
                           arr[i][k]=arr[i][k+1];
                           arr[i][k+1]=temp;                              
                        }
                    }
                s = arr[i][j]+"; "+s;
                }
            s_ans =s_ans + s +"\n";
            s="";
            }
        return s_ans;
        }

        public static String sortMaxToMin (double [][] arr){
            String s ="";
            String s_ans="";
            for (int i = 0; i<arr.length; i++){
                for (int j = arr[i].length-1; j>=0; j--){
                   for (int k = 0; k<j; k++){
                      if(arr[i][k]<arr[i][k+1]){
                           double temp = arr[i][k];
                           arr[i][k]=arr[i][k+1];
                           arr[i][k+1]=temp;                              
                        }
                    }
                s = arr[i][j]+"; "+s;
                }
            s_ans =s_ans + s +"\n";
            s="";
            }
        return s_ans;
        }

        public static void main(String[] args) {
        // Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
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