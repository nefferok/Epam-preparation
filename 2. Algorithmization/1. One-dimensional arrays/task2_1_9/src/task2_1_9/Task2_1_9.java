package task2_1_9;

import javax.swing.JOptionPane;

public class Task2_1_9 {

    public static void main(String[] args) {
        // В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        // чисел несколько, то определить наименьшее из них.
        try{
            String in_n = JOptionPane.showInputDialog(null, "Количество элементов в массиве", JOptionPane.QUESTION_MESSAGE);
            if (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0")) {
                JOptionPane.showMessageDialog(null, "N должно быть целым, положительным и больше 0");
            } else {
                int n = Integer.parseInt(in_n);
                int [] a = new int [n];

                for (int i = 0; i<=n-1; i++){
                    String a_n = JOptionPane.showInputDialog(null, " Элемент массива А["+(i+1)+ "]:", JOptionPane.QUESTION_MESSAGE );
                    if (a_n.contains(".")){
                        JOptionPane.showMessageDialog(null, "Элементы массива должны быть целыми");
                    }
                    a[i] = Integer.parseInt(a_n);
                    }
                    int [] pop =new int [n]; // массив для подсчета частоты встречания элемента
                    for (int i = 0; i<n; i++){
                        for (int j = 0; j<n; j++){ 
                            if (a[i]==a[j]){ 
                                pop[i]++;    // перебор всех элементов и подсчет повторений
                            }
                        }
                    }

                    int mostPopI = 0;
                    for (int i = 0; i < n; i++){
                        if (pop[i] > pop[mostPopI]){
                            mostPopI = i;
                        } 
                        if (pop[i]==pop[mostPopI] && a[i] < a[mostPopI]){
                            mostPopI = i;
                        }
                    }                          
                JOptionPane.showMessageDialog(null, "Наименьший из наиболее часто встречающихся элементов " + a[mostPopI]);
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
