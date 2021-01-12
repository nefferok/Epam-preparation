package task2_4_5;

import javax.swing.JOptionPane;

public class Task2_4_5 {

    public static void main(String[] args) {
       
        try{
            String in_n;
            do {
                in_n = JOptionPane.showInputDialog(null, "N1 должно быть целым, положительным и больше 0!!!\n"
                        + "Количество элемнтов:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));
            int n = Integer.parseInt(in_n);

            int [] arr = new int [n];

            String a_n;
            for (int i = 0; i<n; i++){
                a_n = JOptionPane.showInputDialog(null, "Введите элемент: "+ "\n"
                        + "Элемент "+(i+1)+ ":", JOptionPane.QUESTION_MESSAGE );
                arr[i] = Integer.parseInt(a_n);

            }

            JOptionPane.showMessageDialog(null, "Второе по величине число: "
                    + twoMaxElement(arr));
            
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Данные не ведены или не являются целым числом");
            System.out.println(e);
        }
        catch (NegativeArraySizeException e) {
            JOptionPane.showMessageDialog(null, "Размерность массива не может быть отрицательной");
            System.out.println(e);
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Вы отменили выполнение программы");
            System.out.println(e);
        }
    }
    
    public static int maxElement(int arr[]){
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if (arr[i]> max)
                max = arr[i];
        }
        return max;
    }
    
    public static int twoMaxElement(int arr[]){
        int max2 = arr[0];

        for(int i = 1; i< arr.length; i++){
            if (arr[i] < maxElement(arr) && arr[i] > max2)
                max2 = arr[i];
        }
        return max2;
    }
}
    
