import task4.Train;
import task4.TrainCompareDestination;
import task4.TrainCompareNumber;
import task4.TrainCompareTime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class MainTrain {
    public static void main(String[] args) {
        ArrayList <Train> list = new ArrayList<Train>(5);
        list.add(new Train ("Brest", 7847, "20:48"));
        list.add(new Train ("Brest", 1248, "12:48"));
        list.add(new Train ("Vitebsk", 4711, "15:48"));
        list.add(new Train ("Gomel", 3444, "11:29"));
        list.add(new Train ("Brest", 3489, "20:47"));

        Comparator <Train> compareNum = new TrainCompareNumber();
        TreeSet<Train> comp = new TreeSet<Train>(compareNum);
        comp.addAll(list);

        System.out.println("Sort by numbers:");
        for (Train tr : comp){
            System.out.println(tr.toString());
        }

        System.out.println("Enter the number of train: ");
        Scanner userNumberChoise = new Scanner(System.in);
        int find = Integer.parseInt(String.valueOf(userNumberChoise.next()));
        int count=0;
        for (Train tr : list){
            if (tr.getNumber()==find){
                System.out.println("Information:");
                System.out.println(tr.toString());
                count++;
            }
        }
        if (count==0) System.out.println("Train not found");

        Comparator <Train> compareDest = new TrainCompareDestination().thenComparing(new TrainCompareTime());
        comp = new TreeSet<>(compareDest);
        comp.addAll(list);
        System.out.println();
        System.out.println("Sort by destination and time:");
        for (Train tr : comp){
            System.out.println(tr.toString());
        }

    }
}
