package task3_2_10;

public class Task3_2_10 {

    public static void main(String[] args) {
        String x = "String! Char? Int. boolean long.";
        int count = 0;
        for (int i = 0; i<x.length(); i++){
            if (x.charAt(i)=='?'||x.charAt(i)=='!'||x.charAt(i)=='.'){
                count++;
            }
        }
        System.out.println("Всего предложений: "+ count);
    }
}
