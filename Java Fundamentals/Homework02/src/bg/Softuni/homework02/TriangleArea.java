package bg.Softuni.homework02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*task:
    Write a program that enters 3 points in the plane (as integer x and y coordinates),
    calculates and prints the area of the triangle composed by these 3 points.
    Round the result to a whole number. In case the three points do not form a triangle, print "0" as result.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pointOneX = input.nextInt();
        int pointOneY = input.nextInt();
        int pointTwoX = input.nextInt();
        int pointTwoY = input.nextInt();
        int pointThreeX = input.nextInt();
        int pointThreeY = input.nextInt();



        BigDecimal Area01 = new BigDecimal("0.00");
        BigDecimal Area02 = new BigDecimal("0.00");
        BigDecimal Area03 = new BigDecimal("0.00");
        BigDecimal Area = new BigDecimal("0.00");
            //
        Area01 = new BigDecimal(pointOneX).multiply(new BigDecimal(pointTwoY).subtract(new BigDecimal(pointThreeY)));
        Area02 = new BigDecimal(pointTwoX).multiply(new BigDecimal(pointThreeY).subtract(new BigDecimal(pointOneY)));
        Area03 = new BigDecimal(pointThreeX).multiply(new BigDecimal(pointOneY).subtract(new BigDecimal(pointTwoY)));

        Area = Area01.add(Area02).add(Area03).divide(new BigDecimal("2.00") ).abs().setScale(0, BigDecimal.ROUND_HALF_UP);

        System.out.println(Area);



    }
}
