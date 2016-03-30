package bg.Softuni.homework01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/* Task:
Create a method that finds the average of three numbers. Format the output to two digits after the decimal separator.
 */
public class AverageNumber {
        public static void main(String[] args){
            //read input from the console
            System.out.println("Please provide first number");
            Scanner inputLine = new Scanner(System.in);
            BigDecimal a = inputLine.nextBigDecimal();
            System.out.println("Please provide second number");
            BigDecimal b = inputLine.nextBigDecimal();
            System.out.println("Please provide third number");
            BigDecimal c = inputLine.nextBigDecimal();

            //define average and divider variable
            BigDecimal average = new BigDecimal(0.00);
            BigDecimal divider = new BigDecimal(3.00);
            //calculate the average
            average = average.add(a);
            average = average.add(b);
            average = average.add(c);
            average = average.divide(divider,2,RoundingMode.FLOOR);
            //print the result in the console
            System.out.println(average);
        }
}
