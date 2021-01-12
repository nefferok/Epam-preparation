package task2_4_9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2_4_9 {

    public static double quadrangleArea (double x, double y, double z, double t){
        double halfPer = (x+y+z+t)/2;
        double area = new BigDecimal (Math.sqrt((halfPer-x)*(halfPer-y)*(halfPer-z)*(halfPer-t)))
                .setScale(3, RoundingMode.HALF_UP).doubleValue();
        return area;
    }

    public static void main(String[] args) {
        System.out.println(quadrangleArea(7, 4, 9, 11));
    }
}
