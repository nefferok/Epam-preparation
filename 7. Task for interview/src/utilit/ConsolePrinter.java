package utilit;

import entity.GeneralExam;

import java.util.Collection;

public class ConsolePrinter {

    public static void printList(Collection<GeneralExam> list) {

        if (list != null && !list.isEmpty()) {
            for (GeneralExam element : list) {
                if (element != null) {
                    System.out.println(element.toString());
                }
            }
        }

    }
}
