package task3_1_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_1_5 {

    public static void main(String[] args) {
        String str = "   fjhgkf    skflsl  /uj  ";
        str=str.trim();
        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher(str);
        System.out.println(m.replaceAll(" "));
    }   
}
