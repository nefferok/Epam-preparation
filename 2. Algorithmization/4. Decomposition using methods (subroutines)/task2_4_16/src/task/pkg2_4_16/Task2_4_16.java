package task.pkg2_4_16;

public class Task2_4_16 {

    public static void main(String[] args) {
        // Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
        //Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
        int n = 6;
        System.out.println("Сумма: "+sum (n) + " Количество четных: "+sumFig(sum(n)));
    }

    public static int sumFig (int sum){
        int figSum = 0;
        int len =(""+sum).length();
        for (int i = 1; i<= len; i++){
        if (sum%2==0){
            figSum++;
        }
            sum /=10;
        }
        return figSum;
    }
    
    public static int sum(int n){//от кратности чсла
        int sum = 0;
        for (int i = (int) Math.pow(10, n-1); i<(int) Math.pow(10, n); i++){
            if (check(i)){
                sum+=i;
            }
        }
        return sum;
    }
    
    public static boolean check (int fig){
    int len =(""+fig).length();
    for (int i = 1; i<= len; i++){
        if (fig%2==0){
            return false;
        }
            fig /=10;
    }
    return true;  
    }
}
