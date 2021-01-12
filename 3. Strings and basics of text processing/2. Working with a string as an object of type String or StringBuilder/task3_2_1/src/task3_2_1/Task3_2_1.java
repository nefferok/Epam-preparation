package task3_2_1;

public class Task3_2_1 {

    public static void main(String[] args) {

        String str ="   fjhgkf    "
                + " skflsl  /uj       h ";
        int max = 0;
        int count;
        for (int i = 0; i<str.length(); i++){

            if (str.charAt(i)==' '){
                count = 0;
                while(str.charAt(i)==' '){
                    if (i==str.length()-1){
                        count++;
                    break;}
                    else {
                        count++;
                        i++;
                    }
            }
            if (count>max) max = count;
            }
        }
        System.out.println(max);
    }
}
