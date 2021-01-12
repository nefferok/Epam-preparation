package utulit;

import entity.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Identification {
    public static User Identify() throws Exception {

        ArrayList <User> baseOfUsers = UserFileParser.parse();
        int count1 = 0;
        int count2 = 0;
        User currentUser = null;

        do {
            System.out.println("Enter your nickname: ");
            String userName = userInput();

            for (int i = 0; i <baseOfUsers.size() ; i++) {
                if (baseOfUsers.get(i).getNickname().equals(userName)){
                    count1 = 1;
                    do {
                        System.out.println("Enter your password: ");
                        String userPassword = userInput();
                        if (PasswordHash.check(userPassword, baseOfUsers.get(i).getPassword())) {
                        count2 = 1;
                        currentUser = baseOfUsers.get(i);
                        } else System.out.println("Incorrect password!");
                    } while (count2 == 0);
                }
            }
            if (count1==0) {System.out.println("User is not found");}
        }while (count1==0);
        return currentUser;
    }


    private static String userInput(){
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }
}
