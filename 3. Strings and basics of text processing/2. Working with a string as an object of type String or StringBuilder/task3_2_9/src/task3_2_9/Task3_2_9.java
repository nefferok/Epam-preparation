package task3_2_9;

public class Task3_2_9 {

    public static void main(String[] args) {

        String str = "fgFJHGgdhs fgshgySDVGA";
        int countLitlle =0;
        int countBig = 0;
        for (int i = 0; i< str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            if (s.matches("[A-Z]")){
                countBig++;
            }
            if (s.matches("[a-z]")){
                countLitlle++;
            }
        }
        System.out.println("Маленьких: "+countLitlle+"\nБольших: "+ countBig);
    } 
}
