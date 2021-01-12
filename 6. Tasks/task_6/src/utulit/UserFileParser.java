package utulit;

import entity.User;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class UserFileParser {

    public static ArrayList <User> parse () throws FileNotFoundException {

        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(new File("Base Of Users.txt"));
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            result.append(scanner.next()).append("\n");
        }

        ArrayList <User> userList = new ArrayList<User>();

        String[] elements = result.toString().split("\n");
        for (String element : elements){
            String[] attributes = element.split(" ");
            userList.add(new User(attributes[0], attributes[1], Boolean.parseBoolean(attributes[2]), attributes[3]));
        }
        return userList;
    }
}
