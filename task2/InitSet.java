package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InitSet {
    private static Set<String> wordsOfText = new HashSet<>();
    private static Scanner scanner = null;

    public static Set<String> getWordsOfText() {
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
