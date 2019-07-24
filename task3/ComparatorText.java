package task3;

import java.util.Comparator;

public class ComparatorText implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return 1;
        } else if (str1.length() < str2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
