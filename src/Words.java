import java.util.*;

public class Words {
    List<String> words = new ArrayList<>(List.of("skypro", "java", "IDEA", "IDEA", "java", "skypro"));
    List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public void getUniqWords() {
        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public void getSumDoubleFromUniqWords() {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> sumDoubleWords : wordCounts.entrySet()) {
            int count = sumDoubleWords.getValue();
            System.out.println(count);
        }
    }
}
