package task3;
import task3.ComparatorText;

import java.util.Collections;

public class ServiceText {

    public static void run() {
        InitText.initText();
        Collections.sort(InitText.getWordsOfText());
        System.out.println(InitText.getWordsOfText());
        InitText.getWordsOfText().sort(new ComparatorText());
        System.out.println(InitText.getWordsOfText());
    }
}
