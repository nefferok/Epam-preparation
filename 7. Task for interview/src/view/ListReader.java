package view;

import entity.GeneralExam;
import exception.IncorrectFilePath;
import utilit.ConsolePrinter;
import utilit.ListParser;
import utilit.SimpleFileReader;

import java.util.Collection;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListReader {

    private static final String EXIT = "4";
    private static final String SORT = "2";
    private static final String PRINT_UNSORTED = "1";
    private static final String PRINT_SORTED = "3";

    private static Collection<GeneralExam> list;
    private static SortedSet<GeneralExam> sortedList;

    public static void main(String[] args) {

        if (args.length >= 1 && args[0] != null && !args[0].isEmpty()) {

            loadAndParseFile(args[0]);

            String userChoice = EXIT;

            do {

                System.out.println(
                        "\nChoice one option: \n 1) Print unsorted coolection. \n 2) Sort collection \n 3) Print sorted collection. \n 4) Exit \nEnter your choice:");

                userChoice = userInput();

                if (PRINT_UNSORTED.equals(userChoice)) {

                    print(list);

                } else if (SORT.equals(userChoice)) {

                    sortedList = new TreeSet<GeneralExam>(list);

                } else if (PRINT_SORTED.equals(userChoice)) {

                    if (sortedList != null) {

                        print(sortedList);

                    } else {
                        System.out.println("\n");
                        System.err.println("Please first of all select second option.");
                    }
                }
            } while (!EXIT.equals(userChoice));

        } else {
            System.err.println("Plese enter path to collection file.");
        }
    }

    private static void loadAndParseFile(String filePath) {
        try {

            String fileContent = SimpleFileReader.readFile(filePath);
            list = ListParser.parsTextFile(fileContent);

        } catch (IncorrectFilePath e) {
            System.err.println("Sorry file \"" + filePath + "\" not found.");
        }
    }

    private static String userInput() {
        Scanner userChoiceReader = new Scanner(System.in);
        return userChoiceReader.nextLine();
    }

    private static void print(Collection<GeneralExam> printedList) {
        System.out.println("\n");
        ConsolePrinter.printList(printedList);
        System.out.println("\n");
        System.out.println("Press any key...");
        userInput();
    }
}
