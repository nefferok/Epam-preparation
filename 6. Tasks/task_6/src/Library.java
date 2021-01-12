import create.CreateNewUser;
import entity.User;
import menu.MenuForAdmin;
import menu.MenuForUser;
import utulit.Identification;

import java.util.Scanner;

public class Library {

    private static final String CHOICE_1 = "1";
    private static final String CHOICE_2 = "2";
    private static final String CHOICE_3 = "3";

    public static void main(String[] args) throws Exception {

        String userChoice;
        do{
            System.out.println("Welcome to the library.\n" +
                "1) If you want to leave, enter - 1;\n" +
                "2) If you want to register, enter - 2;\n" +
                "3) If you are registered user, enter -3");
            userChoice = userInput();

            if (userChoice.equals(CHOICE_2)){
                CreateNewUser.create();
            } else if (userChoice.equals(CHOICE_3)){
                User currentUser = Identification.Identify();
                if(currentUser.isAdmin()){
                    MenuForAdmin.menu();
                } else {
                    MenuForUser.menu();
                }
            } else {
                System.err.println("Wrong input!");
            }
        } while (!userChoice.equals(CHOICE_1));

    }

    private static String userInput(){
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }
}
