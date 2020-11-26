import java.io.*;
import java.util.Scanner;

public class Main {
    private static int num;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:/Users/User/IdeaProjects/Letters/src/resources/output.txt"));
        int[] count = new int[26];
        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();
            char[] characters = answer.toCharArray();
            for (char character : characters) {
                if ((character >= 'a') && (character <= 'z')) {
                    count[character - 'a']++;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            num = 25;
            System.out.print((char) (i + 'a'));
            System.out.println(": " + count[i]);

        }
        input.close();
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Main.num = num;
    }
}
