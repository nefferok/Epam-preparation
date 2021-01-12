
import task1.Test1;
import task2.Test2;
import task3.Student;


public class Check {
    public static void main(String[] args) {
        System.out.println("Проверка задания 4.1");//Проверка задания 1 части 4.
        Test1 objectTest1 = new Test1(4, 8);
        objectTest1.printPar1();
        objectTest1.printPar2();
        objectTest1.setPar1(10);
        System.out.println("Sum of parameters = "+ objectTest1.sumParams());
        System.out.println("Maximum = " + objectTest1.maxParam());

        System.out.println("\nПроверка задания 4.2"); // Checking of task 4.2
        Test2 objectTest2 = new Test2(); // Create object with default parameters
        System.out.println("Value1 = " + objectTest2.getValue1()); // getting values of default parameters
        System.out.println("Value2 = " + objectTest2.getValue2());
        Test2 objectTest2p = new Test2("Value", 47);
        objectTest2p.setValue1("Changed");
        objectTest2p.setValue2(111);
        System.out.println(objectTest2p.toString());

        System.out.println("\nПроверка задания 4.3"); // Checking of task 4.3
        Student [] students = new Student[10];
        students[0] = new Student("Pupkin A.D.", 25,   4, 5, 6, 7, 8);
        students[1] = new Student("Popkin A.D.", 35,   4, 5, 6, 7, 8);
        students[2] = new Student("Ivanov A.D.", 14,   4, 5, 6, 7, 8);
        students[3] = new Student("Sidorov A.D.", 25,   4, 5, 6, 7, 8);
        students[4] = new Student("Petrov A.D.", 13,   4, 5, 6, 7, 8);
        students[5] = new Student("jurov A.D.", 25,   4, 5, 6, 7, 8);
        students[6] = new Student("Vaskin A.D.", 25,   4, 5, 6, 7, 8);
        students[7] = new Student("Putin A.D.", 18,   9, 9, 9, 9, 9);
        students[8] = new Student("Putin A.D.", 25,   4, 5, 6, 7, 8);
        students[9] = new Student("Lukashenko A.D.", 19,   10, 10, 10, 10, 10);

        for (int i = 0; i < students.length; i++) {
            if (students[i].isExcelent()){
                System.out.println(students[i].nameAndGroup());
            }

        }

    }

}
