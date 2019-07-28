package collections;

import java.util.*;

public class TextService {

    private Repository repository = new Repository();

    public void collectionTask1() {
        Map<String, Integer> quantityReplayWords = new HashMap<>();
        for (String token : repository.getList()) {
            String word = token.toLowerCase();
            Integer count = quantityReplayWords.get(word);
            if (count == null) {
                quantityReplayWords.put(word, 1);
            } else {
                quantityReplayWords.put(word, count + 1);
            }
        }
        System.out.println(quantityReplayWords);
    }

    public void collectionTask2() {
        Set<String> uniqueWords = new HashSet<>();
        for (String token : repository.getList()) {
            String word = token.toLowerCase();
            uniqueWords.add(word);
        }
        System.out.println(uniqueWords);
    }

    public void collectionTask3() {
        Collections.sort(repository.getList());
        System.out.println(repository.getList());
        repository.getList().sort(new ComparatorText());
        System.out.println(repository.getList());
    }
}
