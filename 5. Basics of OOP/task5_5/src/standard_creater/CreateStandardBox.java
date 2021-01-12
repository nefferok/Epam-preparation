package standard_creater;

import entitiy.bouquet.builder.PreparedBouquet;
import entitiy.sweet.BoxWithSweets;
import entitiy.sweet.PackagingSweets;
import entitiy.sweet.Sweets;
import entitiy.sweet.builder.BuilderBox;
import entitiy.sweet.builder.PreparedBoxes;
import stub.Stub;

import java.util.Scanner;

public class CreateStandardBox {

private static final String CHOICE_2 = "2";
private static final String CHOICE_1 = "1";
private static final String CHOICE_3 = "3";

    public static BoxWithSweets create(String name){

        System.out.println("Would you like?\n" +
                "1 - Create your own box with sweets\n" +
                "2 - Buy prepared box");
        String userChoice = userInput();
        //String userChoice = Stub.stub1();
        do {
            if (userChoice.equals(CHOICE_1)) {

                // Реализация паттерна Builder без контестного меню
                BuilderBox builder =  new BuilderBox();
                builder.setForWhom(name);
                builder.setPackaging(PackagingSweets.CARDBOARD);
                builder.addFSweets(Sweets.LOLLIPOPS);
                builder.addFSweets(Sweets.COOKIES);
                builder.addFSweets(Sweets.CHOCOLATE);
                return builder.getBox();

            } else if (userChoice.equals(CHOICE_2)) {
                do {
                System.out.println("Which prepares box do you choose?\n" +
                        "1- Box with sweets number 1\n" +
                        "2- Box with sweets number 2\n" +
                        "3- Box with sweet number 3");
                userChoice = userInput();
                    if (userChoice.equals(CHOICE_1)){
                        return PreparedBoxes.box_1(name);
                    } else if (userChoice.equals(CHOICE_2)){
                        return PreparedBoxes.box_2(name);
                    } else if (userChoice.equals(CHOICE_3)){
                        return PreparedBoxes.box_3(name);
                    } else System.err.println("Wrong data! Try again!");

                } while (!userChoice.equals(CHOICE_1)||!userChoice.equals(CHOICE_2)||!userChoice.equals(CHOICE_3));

            } else System.err.println("Wrong input");
        } while (userChoice.equals(CHOICE_1)||userChoice.equals(CHOICE_2));

        return null;
    }

    private static String userInput(){
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }
}
