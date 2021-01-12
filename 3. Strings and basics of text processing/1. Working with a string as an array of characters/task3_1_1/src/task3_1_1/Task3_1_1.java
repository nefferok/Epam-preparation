package task3_1_1;

import javax.swing.JOptionPane;

public class Task3_1_1 {

    public static void main(String[] args) {
        try{
            String in_n;
            do {
                in_n = JOptionPane.showInputDialog(null, "N должно быть целым, положительным и больше 0!!!\n"
                        + "Введите количество переменных N:", JOptionPane.QUESTION_MESSAGE);
            }
            while (in_n.contains(".") || in_n.startsWith("-")|| in_n.equals("0"));
            int n = Integer.parseInt(in_n);
            String a_n;
            String [] a = new String [n];
            for (int i = 0; i<n; i++){

                a[i] = JOptionPane.showInputDialog(null, "Введите переменную: "
                        , JOptionPane.QUESTION_MESSAGE );
            }

            fillArr(a);


            for (int i = 0; i<n; i++){
                System.out.println(a[i]);
            }

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

    public static void fillArr (String [] start){
        for(int i = 0; i< start.length; i++){
            start[i]=FormNewStr(start[i]);
        }
    }

    public static String FormNewStr (String s){
        String newS ="";
        char [] arr = s.toCharArray();

        for (int i = 0; i<arr.length; i++){
            if (isHighReg(arr[i])){
                String str = "" + arr[i];
                str = str.toLowerCase();
                newS += "_" + str;
            } else {
                newS+=arr[i];
            }
        }
        return newS;
    }

    public static boolean isHighReg (char ch){
        String s = String.valueOf(ch);
        return s.matches("[A-Z]");
    }
}
