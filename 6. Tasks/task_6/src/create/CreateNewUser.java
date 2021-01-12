package create;

import entity.User;
import utulit.UserFileWriter;

import java.util.Scanner;

public class CreateNewUser {

    public static void create () throws Exception {

        BuilderUser newUser = new BuilderUser();

        System.out.println("Enter nickname: ");
        newUser.setNickname(userInput());

        System.out.println("Enter password: ");
        newUser.setPassword(userInput());

        newUser.isAdmin(false);

        System.out.println("Enter e-mail: ");
        newUser.setEmail(userInput());

        /*System.out.println("is Admin? ");

        if (userInput().equals("true")){
            newUser.isAdmin(true);
        } else if (userInput().equals("false")){
            newUser.isAdmin(false);
        } else newUser.isAdmin(false);*/

        User user = newUser.getUser();
        UserFileWriter.writeInFile(user);

    }

    private static String userInput(){
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }
}
