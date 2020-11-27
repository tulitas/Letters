import java.io.*;
import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static final String filePath = "C:/Users/user/IdeaProjects/Letters/src/resources/output.txt";
    private static final int[] count = new int[26];
    private static int totalLetters = 0;

    public static void main(String[] args) throws FileNotFoundException {
        takeFile();
    }

    public static void takeFile() {
        try {
            input = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("Can`t find file");
        }
        takeLetters();
    }

    public static void takeLetters() {
        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();
            char[] characters = answer.toCharArray();
            for (char character : characters) {
                if ((character >= 'a') && (character <= 'z')) {
                    count[character - 'a']++;
                }
                totalLetters++;
            }
        }
        makeResult();
        takeAllLeters();
    }

    public static void takeAllLeters() {
        System.out.println("Total letters: " + totalLetters);
    }

    private static void makeResult() {
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 'a'));
            System.out.println(": " + count[i]);
        }
        input.close();
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Main.input = input;
    }

    static String getFilePath() {
        return filePath;
    }

    public static int getTotalLetters() {
        return totalLetters;
    }

    public static void setTotalLetters(int totalLetters) {
        Main.totalLetters = totalLetters;
    }
}