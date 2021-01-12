package task3_1_2;

public class Task3_1_2 {

    public static void main(String[] args) {
        String start = "word letter word word letter lesson";
        int ind;
        String per;
        String find ="word";
        String input = "letter";
        do{
            ind = start.indexOf(find);
            if (ind != -1 ){
                per = start.substring(0, ind);
                per = per + input;
                start = per + start.substring(ind+find.length()); 
            }  
        } while (ind != -1);
        System.out.println(start);
    }
    
}
