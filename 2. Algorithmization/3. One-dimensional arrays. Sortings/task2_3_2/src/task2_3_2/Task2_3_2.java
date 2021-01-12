package task2_3_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Task2_3_2 {

    /**
     * @param arr1
     * @param arr2
     * @return 
     */
     public static String include (ArrayList <Double> arr1, ArrayList <Double> arr2){
        String s =""; 
        for (int i = 0; i<arr1.size();i++){
            for (int j = 0; j<arr2.size(); j++){
                if (arr1.get(i)>=arr2.get(j)){
                    arr1.add(i, arr2.get(j));
                    arr2.remove(j);
                }    
            }                           
        }
        for (int i=0; i<arr1.size(); i++){
            s = s + arr1.get(i) + "; ";
        }
        return s;
        }  

    public static void main(String[] args) {
        try{
        
           String in_n1;
           String in_n2;

           do {
               in_n1 = JOptionPane.showInputDialog(null, "N1 должно быть целым, положительным и больше 0!!!\n"
                       + "Введите количество элементов первого массива N1:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n1.contains(".") || in_n1.startsWith("-")|| in_n1.equals("0"));
            int n1 = Integer.parseInt(in_n1);
        
            do {
                 in_n2 = JOptionPane.showInputDialog(null, "N2 должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество элементов вторго массива N2:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n2.contains(".") || in_n2.startsWith("-")|| in_n2.equals("0"));
            int n2 = Integer.parseInt(in_n2);
       
            ArrayList <Double> arr1 = new ArrayList();
            ArrayList <Double> arr2 = new ArrayList();
         
            String a_n;
            String b_n;

            for (int i = 0; i<n1; i++){
                a_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                         + "А["+(i+1)+ "];", JOptionPane.QUESTION_MESSAGE );
                arr1.add(Double.parseDouble(a_n));
            } 
              
            for (int i = 0; i<n2; i++){
                b_n = JOptionPane.showInputDialog(null, "Введите элемент массива "
                        + "B["+(i+1)+ "];", JOptionPane.QUESTION_MESSAGE );
                arr2.add(Double.parseDouble(b_n));
            } 
            JOptionPane.showMessageDialog(null, "Новый массив:\n" + include(arr1, arr2));  
        
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
