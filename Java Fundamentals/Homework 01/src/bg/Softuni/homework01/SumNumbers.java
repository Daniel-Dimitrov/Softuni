package bg.Softuni.homework01;

import java.util.Scanner;

/*
 Task:
 Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N (inclusive).
 */
public class SumNumbers {
    public static void main(String[] args){
        //read input from the console
        System.out.println("Please provide number N");
        Scanner inputLine = new Scanner(System.in);
        Integer maxNumber = inputLine.nextInt();

        //calculate the sum of the numbers
        Long Sum = 0l;
        for (int i = 0; i <=maxNumber ; i++) {
            Sum = Sum + i;
        }
        //print the result
        System.out.println(Sum);
    }
}
