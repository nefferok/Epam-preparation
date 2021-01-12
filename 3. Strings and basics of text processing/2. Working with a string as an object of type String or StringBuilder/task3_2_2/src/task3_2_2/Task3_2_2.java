package task3_2_2;

public class Task3_2_2 {

    public static void main(String[] args) {

        String str = "afhjfg gjfklga ajfkfajh aaaaaa";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i<sb.length(); i++){
            if (sb.charAt(i)=='a'){
                sb.insert(i+1, 'b');
            }
        }
        System.out.println(sb);      
    }
}
