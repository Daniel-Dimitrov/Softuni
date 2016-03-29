package bg.Softuni.homework01;

/*
Task:
Print the characters from ‘a’ to ‘z’ on the console on a single line, separated by a space.
Use a for-loop. Note: you can directly declare and increment char in the for-loop. for (char c = ‘a’; …)
 */

public class PrintCharacters {
    public static void main(String[] args){
        StringBuilder outputString = new StringBuilder();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            outputString.append(letter + " ");
        }
        outputString.deleteCharAt(outputString.length()-1);
        System.out.println(outputString.toString());
    }
}
