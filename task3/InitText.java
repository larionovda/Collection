package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitText {
    private static List<String> wordsOfText = new ArrayList<>();
    private static Scanner scanner = null;

    public static List<String> getWordsOfText() {
        return wordsOfText;
    }

    public static void initText() {
        try {
            String separator = File.separator;
            String path = separator + "Users" + separator + "Dima" + separator + "Desktop" + separator + "test.txt";
            File file = new File(path);
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                wordsOfText.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
