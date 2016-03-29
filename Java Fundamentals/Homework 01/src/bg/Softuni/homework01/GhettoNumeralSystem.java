package bg.Softuni.homework01;

import java.util.Scanner;

/*
    Task:
Write a program that converts the decimal number system to the ghetto numeral system. In the ghetto, numbers are represented as following:
0 – Gee
1 – Bro
2 – Zuz
3 – Ma
4 – Duh
5  - Yo
6 – Dis
7 – Hood
8 – Jam
9 – Mack
 */
public class GhettoNumeralSystem {
    public static void main(String[] args){
        //read input from the console
        System.out.println("Please provide number of characters");
        Scanner inputLine = new Scanner(System.in);
        Integer inputNumber = inputLine.nextInt();

        //define array with the conversion values
        String conversionArr[] = new String[10];

        //populate the conversion array
        conversionArr[0]= "Gee";
        conversionArr[1]= "Bro";
        conversionArr[2]= "Zuz";
        conversionArr[3]= "Ma";
        conversionArr[4]= "Duh";
        conversionArr[5]= "Yo";
        conversionArr[6]= "Dis";
        conversionArr[7]= "Hood";
        conversionArr[8]= "Jam";
        conversionArr[9]= "Mack";
    }
}
