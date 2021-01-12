package standard_creater;

import entitiy.bouquet.Bouquet;
import entitiy.bouquet.Flowers;
import entitiy.bouquet.PackagingFlowers;
import entitiy.bouquet.builder.BuilderBouquet;
import entitiy.bouquet.builder.PreparedBouquet;

import java.util.Scanner;

public class CreateStandardBouquet {
    private static final String CHOICE_2 = "2";
    private static final String CHOICE_1 = "1";
    private static final String CHOICE_3 = "3";

    public static Bouquet create(String name){

        System.out.println("Would you like?\n" +
                "1 - Create your own bouquet with sweets\n" +
                "2 - Buy prepared bouquet");
        String userChoice = userInput();
        //String userChoice = Stub.stub1();
        do {
            if (userChoice.equals(CHOICE_1)) {

                // Реализация паттерна Builder без контестного меню
                BuilderBouquet builder =  new BuilderBouquet();
                builder.setForWhom(name);
                builder.setPackaging(PackagingFlowers.BASKET);
                builder.addFlowers(Flowers.ROSE_1);
                builder.addFlowers(Flowers.ROSE_1);
                builder.addFlowers(Flowers.ROSE_1);
                builder.addFlowers(Flowers.ROSE_1);
                builder.addFlowers(Flowers.ROSE_1);
                return builder.getBouquet();

            } else if (userChoice.equals(CHOICE_2)) {
                do {
                    System.out.println("Which prepares box do you choose?\n" +
                            "1- Bouquet of rose 1\n" +
                            "2- Bouquet of short roses 2\n" +
                            "3- Bouquet of tulips 3");
                    userChoice = userInput();
                    if (userChoice.equals(CHOICE_1)){
                        return PreparedBouquet.bouquetRoses(name);
                    } else if (userChoice.equals(CHOICE_2)){
                        return PreparedBouquet.bouquetShort(name);
                    } else if (userChoice.equals(CHOICE_3)){
                        return PreparedBouquet.bouquetTulips(name);
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
