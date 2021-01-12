package task2_4_4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Task2_4_4 {
    
    public static void main(String[] args) {

        try{
            String in_n;
            do {
                in_n = JOptionPane.showInputDialog(null, "N1 должно быть целым, положительным и больше 0!!!\n"
                        + "Количество дробей:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));
            int n = Integer.parseInt(in_n);

            int [][] arr = new int [n][2];

            String a_n;
            for (int i = 0; i<n; i++){
                a_n = JOptionPane.showInputDialog(null, "Введите координаты Х и У через пробел: "+ "\n"
                        + "Точка "+(i+1)+ ":", JOptionPane.QUESTION_MESSAGE );
                arr[i][0] = Integer.parseInt(a_n.substring(0, a_n.indexOf(" ")));
                arr[i][1] = Integer.parseInt(a_n.substring(a_n.indexOf(" ")+1));
            }

            double dist = new BigDecimal(maxDistance(arr)[0]).setScale(3, RoundingMode.HALF_UP).doubleValue();

            JOptionPane.showMessageDialog(null, "Максимальное растояние между точками: "
                    + ((int) maxDistance(arr)[1]) + " и " + ((int) maxDistance(arr)[2])
                    + "\nРасстояние составляет: " + (dist));
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

    public static double distance (int [] arr1, int [] arr2){
        double dis = Math.sqrt(Math.pow((arr1[0]-arr2[0]), 2)+Math.pow((arr1[1]+arr2[1]), 2));
        return dis;
    }

    public static double [] maxDistance (int [][] arr){
        double [] max_param = new double [3];
        max_param[0] = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (distance(arr[i], arr[j])>max_param[0]){
                    max_param [0] = distance(arr[i], arr[j]);
                    max_param [1] = i+1;
                    max_param [2] = j+1;
                }
            }
        }
        return max_param;
    }
}
