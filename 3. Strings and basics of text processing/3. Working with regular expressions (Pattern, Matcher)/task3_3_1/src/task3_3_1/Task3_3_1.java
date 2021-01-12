package task3_3_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_3_1 {

    public static void main(String[] args) {

        String str ="Giraffes are very beautiful and unusual animals. They are the tallest land animals in the world. Giraffes can reach a height of 5,5 m and a weight of 900 kg. They are famous for their long necks. But does anybody know, that giraffes have a very long tongue? They even can clean the ears with it! Giraffes are usually yellow or light brown with dark stains. Giraffes live in African savannas. They can live from 20 to 30 years. It is interesting to know, that giraffes sleep only twenty minutes at a time. They sit down on the ground and bend their long neck down.\n" +
"You can often meet giraffes in city Zoos. They are very friendly and all the children like them very much.\n"+
"Giraffes do not hunt. They eat leaves, grass, and fruit. Due to their long neck, they can reach the highest leaves on the trees that other animals cannot eat.";
        
        Pattern p_p = Pattern.compile("\\n");
        String [] paragraph = p_p.split(str);
        String[][] sentense = new String [paragraph.length][];
        for (int i = 0; i<paragraph.length; i++){
            sentense [i] = paragraph[i].split("[.!?]\\s*");
            }
        System.out.println(sortWords(sentense[2][0]));
        System.out.println((sentense[2][0]));
        System.out.println(sortPar(str));
        
    }
    public static String sortWords (String sent){
        Pattern p_w = Pattern.compile("\\s");
        String [] words = p_w.split(sent);
        String max, answer="";
        for (int i = 0; i< words.length; i++){
            for (int j = i+1; j< words.length; j++){
                if (words[j].length()> words[i].length()) {
                    max = words [j];
                    words [j] = words [i];
                    words [i] = max;
            }
            }
        }
        for (String word : words) {
            answer += word+" ";
        }
        return answer;

    }
    public static String sortPar (String text){
        Pattern p_p = Pattern.compile("\\n");
        String [] par = p_p.split(text);
        String[][] sent = new String [par.length][];
        for (int i = 0; i<par.length; i++){
            sent [i] = par[i].split("[.!?]\\s*");
            }
        String [] max;
        for (int i =0; i< sent.length; i++){
            for (int j =i+1; j< sent.length; j++){
           if (sent [j].length>sent [i].length){
               max = sent [j];
               sent [j] = sent [i];
                    sent [i] = max;
           } 
        }
    }
        String sort = "";
        for (int i =0; i<par.length; i++){
        sort += par [i] + "\n";  
    }
        return sort;
    }

    public static void sortPar2 (String [] par){
        Pattern p_s = Pattern.compile("[.!?]\\s*");
        int max = 0;
        for (int i = 0; i<par.length; i++){
            int count = 0;
               Matcher m = p_s.matcher(par[i]);
                if (m.find()){
                    count++;
                }
        }
   }
}
        
                

   
 
    

