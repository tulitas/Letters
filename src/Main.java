import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:/Users/User/IdeaProjects/Letters/src/resources/output.txt"));

        int[] count = new int[26];

        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();
            char[] characters = answer.toCharArray();
            /// change here!
            for (int i = 0; i< characters.length ; i++) {
                if((characters[i] >='a') && (characters[i]<='z')) {
                    count[characters[i] -'a' ]++;
                }
            }
            /// change ends.
        }

        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 'a'));
            System.out.println(": " + count[i]);
        }
        input.close();
    }
}
