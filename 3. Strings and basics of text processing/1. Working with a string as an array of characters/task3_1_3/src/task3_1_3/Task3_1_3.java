package task3_1_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_1_3 {

    public static void main(String[] args) {
    String start = "wor7d lett60er wo5rd 4word 1letter less45on";
    Pattern p = Pattern.compile("(\\d)");
    Matcher m = p.matcher(start);
    int count = 0;
           while (m.find()) {
               count++;
        }
    System.out.println("Количество чисел: " + count);
    }
    
}
