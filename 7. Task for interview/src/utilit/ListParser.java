package utilit;

import entity.GeneralExam;
import entity.HardExam;
import entity.MediumExam;
import entity.SimpleExam;

import java.util.ArrayList;
import java.util.List;

public class ListParser {

    private static final String FIRST_TYPE = "1";
    private static final String SECOND_TYPE = "2";
    private static final String THIRD_TYPE = "3";

    public static List<GeneralExam> parsTextFile(String fileContent) {

        ArrayList<GeneralExam> resultList = new ArrayList<>();

        if (fileContent != null && !fileContent.isEmpty()) {

            String[] elements = fileContent.split("\n");

            for (String element : elements) {

                String[] attributes = element.split(" ");

                if (attributes[0].equals(FIRST_TYPE)) {

                    resultList.add(parsHardExam(attributes));

                } else if (attributes[0].equals(SECOND_TYPE)) {

                    resultList.add(parsMediumExam(attributes));

                } else if (attributes[0].equals(THIRD_TYPE)) {

                    resultList.add(parsSimpleExam(attributes));
                }

            }
        }

        return resultList;
    }

    private static GeneralExam parsHardExam(String[] attributes) {
        return new HardExam(attributes[1], Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3]));
    }

    private static GeneralExam parsMediumExam(String[] attributes) {
        return new MediumExam(attributes[1], Double.parseDouble(attributes[2]), Boolean.parseBoolean(attributes[3]));
    }

    private static GeneralExam parsSimpleExam(String[] attributes) {

        boolean[] resualts = new boolean[5];

        for (int i = 2, j = 0; i < attributes.length; i++, j++) {
            resualts[j] = Boolean.parseBoolean(attributes[i]);
        }

        return new SimpleExam(attributes[1], resualts);
    }

}
