import entitiy.Present;
import entitiy.sweet.BoxWithSweets;
import entitiy.sweet.PackagingSweets;
import entitiy.sweet.Sweets;
import standard_creater.CreateStandardBouquet;
import standard_creater.CreateStandardBox;

import java.util.Scanner;

public class PresentRealisation {

    private static final String CHOICE_1 = "1";
    private static final String CHOICE_2 = "2";
    private static final String CHOICE_3 = "3";
    private static final String CHOICE_4 = "4";


    public static void main(String[] args) {

        String userChoice = CHOICE_1;
        System.out.println("What kind of present do you want to buy?\n" +
                "1) I don't want to buy anything (Enter 1)\n" +
                "2) I'd lick to buy a bouquet (Enter 2)\n" +
                "3) I'd lick to buy a box with sweets(Enter 3)");
        userChoice = userInput();
        Present present = null;
        if (userChoice.equals(CHOICE_2)){
            System.out.println("Please enter the name of recipient");
            //String name = userInput();
            String name = "Ivan";
            present = CreateStandardBouquet.create(name);


        } else if (userChoice.equals(CHOICE_3)){
            System.out.println("Please enter the name of recipient");
            //String name = userInput();
            String name = "Ivan";
            present = CreateStandardBox.create(name);


        } else if (userChoice.equals(CHOICE_1)){

            System.out.println("You didn't buy anything!!! Good bue!");

        } else System.err.println("Wrong input data!!! Start again!");




        System.out.println(present);


    }
    private static String userInput(){
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }
}
