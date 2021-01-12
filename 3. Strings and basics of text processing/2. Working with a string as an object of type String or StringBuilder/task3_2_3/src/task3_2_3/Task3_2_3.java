package task3_2_3;

public class Task3_2_3 {

    public static void main(String[] args) {
        String str = "KASVSAK";
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        if(str.equals(str1)){
            System.out.println("polyndrom");
        } else {
            System.out.println(" not a polyndrom");      
        }
    }  
}
