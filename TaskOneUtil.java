package lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TaskOneUtil {

    public static List<String> splitTextIntoWords(String originalText) {
        return Arrays.asList(originalText.split("[\\s,.!-]+"));
    }

    public static HashMap<String, Integer> wordCount(List<String> words) {
        HashMap<String, Integer> countedWords = new HashMap<>();
        for (String word : words) {
            isWordUnique(countedWords, word);
            countedWords.put(word, countedWords.get(word) + 1);
        }
        return countedWords;
    }

    private static void isWordUnique(HashMap<String, Integer> countedWords, String word) {
        if (!countedWords.containsKey(word)) {
            countedWords.put(word, 0);
        }
    }

    public static void countedWordsResultDisplay(HashMap<String, Integer> countedWords) {
        for (String word : countedWords.keySet()) {
            System.out.println(word + " " + countedWords.get(word));
        }
    }
}