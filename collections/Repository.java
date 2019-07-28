package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repository {

    private static final String FILE_NAME = "src/text.txt";
    private List<String> list = new ArrayList<>();

    public Repository() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String string;
            while ((string = reader.readLine()) != null) {
                String[] words = string.split("\\s*(\\s|,|!|\\.)\\s*");
                Collections.addAll(list, words);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getList() {
        return list;
    }
}
