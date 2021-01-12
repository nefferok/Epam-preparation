package task3_2_8;

public class Task3_2_8 {

    public static void main(String[] args) {
        String str = "asda dhfjh hsdfkjfdkfdh fdjhfhdhjhkjhkh";
        String max = "";
        for (int i = 0; i<str.length(); i++){
            int count = 0;
            String out ="";
            while (str.charAt(i)!=' '){
                if (i==str.length()-1){
                    out += str.charAt(i);
                        count++;
                    break;}
                    else {
                    out += str.charAt(i);
                        count++;
                        i++;
                    }
            }
            if (count > max.length()) max = out;
        }
        System.out.println(max);
    }   
}
