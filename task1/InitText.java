package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InitText {

    private static Map<String, Integer> wordMap = new HashMap<>();
    private static Scanner scanner = null;

    public static void initText() {
        try {
            List<String> list = new ArrayList<>();
            String separator = File.separator;
            String path = separator + "Users" + separator + "Dima" + separator + "Desktop" + separator + "test.txt";
            File file = new File(path);
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
            for (String token : list) {
                String word = token.toLowerCase();
                Integer count = wordMap.get(word);
                if (count == null) {
                    wordMap.put(word, 1);
                } else {
                    wordMap.put(word, count + 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        System.out.println(wordMap);
    }
}

