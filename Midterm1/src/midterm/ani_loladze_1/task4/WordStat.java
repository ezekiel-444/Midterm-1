package midterm.ani_loladze_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words provided
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print the set of unique words on the console
        System.out.println("Set of unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Create a map with the length of the word as the key and the number of words with that length as the value
        Map<Integer, Integer> wordLengthCountMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCountMap.put(length, wordLengthCountMap.getOrDefault(length, 0) + 1);
        }

        // Print the map on the console
        System.out.println("\nMap of word lengths and their counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCountMap.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
        }

        // Add console output to "task4.txt" file
        try (FileWriter writer = new FileWriter("task4.txt", true)) {
            writer.write("\n\nSet of unique words:\n");
            for (String word : uniqueWords) {
                writer.write(word + "\n");
            }

            writer.write("\nMap of word lengths and their counts:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthCountMap.entrySet()) {
                writer.write("Length " + entry.getKey() + ": " + entry.getValue() + " words\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
