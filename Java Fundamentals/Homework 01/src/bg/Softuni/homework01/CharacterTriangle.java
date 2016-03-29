package bg.Softuni.homework01;

import java.util.Scanner;

/*
Task:
Create a triangle of characters, based on input.
 */
public class CharacterTriangle {
    public static void main(String[] args){
        //read input from the console
        System.out.println("Please provide number of characters");
        Scanner inputLine = new Scanner(System.in);
        Integer charNumber = inputLine.nextInt();

        // create 2D array for storing the triangle
        char matrix[][] = new char[charNumber][2*charNumber-1];
        short columnIndex = 0;
        short rowIndex = 0;

        //populate the array with correct character per column
        char currentChar = 'a';
        for (columnIndex = 0; columnIndex <= charNumber-1; columnIndex++) {
            for (rowIndex = 0; rowIndex < (2*charNumber-1) ; rowIndex++) {
                matrix[columnIndex][rowIndex] = currentChar;
            }
            currentChar++;
        }

        //print the array to the console
        StringBuilder rowOutput = new StringBuilder();

        for (rowIndex = 0; rowIndex < (2*charNumber-1); rowIndex++) {
            for (columnIndex = 0; columnIndex <= charNumber-1; columnIndex++) {
                rowOutput.append(matrix[columnIndex][rowIndex]);
            }
            System.out.println(rowOutput.toString());
            rowOutput.delete(0,rowOutput.length());
        }
    }
}

