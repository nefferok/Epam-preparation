package task3_2_5;

public class Task3_2_5 {

    public static void main(String[] args) {

        String str ="fajhagkf skfalsl  /uj aaaah ";
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)=='a'){
                        count++;
            }
        }
        System.out.println(count);
    }
}
