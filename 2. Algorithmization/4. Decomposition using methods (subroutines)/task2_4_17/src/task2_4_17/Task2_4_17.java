package task2_4_17;

public class Task2_4_17 {

    public static void main(String[] args) {
        // Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
        //действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
        int n = 9999;
        System.out.println(temp(n));
    }
        
    public static int temp (int number){
        int temp = 0;
        while (number>0){
            number -= sumFig(number);
            temp++;
            }
        return temp;
        }

    public static int sumFig (int fig){
        int figSum = 0;
        int len =(""+fig).length();
        for (int i = 1; i<= len; i++){
            int cur = fig % 10;
            figSum += cur;
            fig /=10;
        }
        return figSum;
    }    
}
