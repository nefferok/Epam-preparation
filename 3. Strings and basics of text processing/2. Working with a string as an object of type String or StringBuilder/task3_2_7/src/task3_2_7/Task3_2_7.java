package task3_2_7;

public class Task3_2_7 {

    public static void main(String[] args) {
        String str = " abc ffddee";
        StringBuilder sb =new StringBuilder (str);
        for (int i = 0; i< sb.length()-1; i++){
            if (sb.charAt(i)==' ') {
                sb.deleteCharAt(i);
            }
            if (sb.charAt(i)==sb.charAt(i+1))
                sb.deleteCharAt(i);
        }
        System.out.println(sb);
    }   
}
