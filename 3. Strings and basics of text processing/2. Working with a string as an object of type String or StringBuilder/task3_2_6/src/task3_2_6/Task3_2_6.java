package task3_2_6;

public class Task3_2_6 {

    public static void main(String[] args) {

        String str = "afhjfg";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i<sb.length(); i+=2){
            sb.insert(i+1, sb.charAt(i));
        }
        System.out.println(sb);
    }   
}
