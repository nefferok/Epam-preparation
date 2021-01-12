package task3;

import java.util.Arrays;

public class Student {
    private static final int EXCELENCE = 5;

    private String surname;
    private int groupNumber;
    private int [] grade = new int [5];

    public Student(String surname, int groupNumber, int... grade) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public boolean isExcelent(){            //Checking are the students excelent
        int count = 0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i]>8) count++;
        }
        if (count == EXCELENCE) {
            return true;
        }else {
            return false;
        }
    }

    public String nameAndGroup() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }

}
