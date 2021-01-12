import Entities.Bag;
import Entities.Cave;
import Entities.Dragon;
import Utilites.RandomTreasureCreater;
import Utilites.TreasureWriter;
import Utilites.TreasuresPrinter;

import java.io.IOException;
import java.util.Scanner;

public class DragonAndHisTreasures {

    private static final String EXIT = "1";
    private static final String CONTINUE = "2";
    private static final String ADD = "3";
    private static final String SEE = "4";

    public static void main(String[] args) throws IOException {


        String userChoice = EXIT;
        System.out.println("You walk through the forest and suddenly notice a cave\nWhat do you decide:\n" +
                "If you want to pass by, input 1\nIf you want to enter the cave, input 2");
        userChoice = userInput();
        if (CONTINUE.equals(userChoice)){

            System.out.println("You met a dragon. He told you, if you guess what his name is," +
                    " he will let you buy his treasure at a discount.\n" +
                    "You decided to try.\nPlease input the dragons name:");
            Dragon dragon = new Dragon(userInput());
            Cave cave = new Cave(dragon);

            System.out.println("You were right!!! The dragons real name is "+ dragon.getName());
            System.out.println("The dragon will sell you his treasures.\nHow much money do you have?");

            int money = Integer.parseInt(userInput());
            cave.setTreasures(RandomTreasureCreater.creater());
            TreasureWriter.writeInFile(cave);

            Bag yourBag = new Bag(money);

            System.out.println("Let's start buying!!!");
            do{

                System.out.println("You can choose the following:\n" +
                        "1) If you want to live the cave, input 1\n" +
                        "2) If you want to see all the treasures in the cave, input 2\n" +
                        "3) If you want to put the treasures in your bag, input 3\n" +
                        "4) If you want to see the treasures in your bag, input 4");
                userChoice = userInput();
                if (CONTINUE.equals(userChoice)){
                    TreasuresPrinter.printArray(cave.getTreasures());
                } else if (ADD.equals(userChoice)){
                    System.out.println("Enter the number of treasure which you want to add in your bag");
                    yourBag.addTreasure(cave.getTreasures()[(Integer.parseInt(userInput()))-1]);
                } else if (SEE.equals(userChoice)){
                    TreasuresPrinter.printList(yourBag.getTreasures());
                    System.out.println("Money in your bag: " + yourBag.getYourMoney());
                } else if (!EXIT.equals(userChoice)){
                    System.err.println("Please, input the correct data!!!");
                }

            } while (!EXIT.equals(userChoice));
            System.out.println("You decided to leave.");
            System.out.println("Your bag: ");
            TreasuresPrinter.printList(yourBag.getTreasures());
            TreasureWriter.writeInFile(yourBag);
            System.out.println("Money in your bag: " + yourBag.getYourMoney());

        } else if (EXIT.equals(userChoice)){
            System.out.println("You decided to leave. Well, it's your decision. Good bye!");
        } else {
            System.err.println("Your input data was incorrect. Start again!");
        }
    }

    private static String userInput(){
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }
}
