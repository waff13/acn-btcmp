package Day03;

import java.util.HashSet;
import java.util.Set;

public class Task02 {

    //2 Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
    //Think of how you could use any of the Set implementation to implement this program.

    // Bonus:
    // Ignore case sensitivity. For example, Apple and apple should be counted as the same word.
    //Hint: to get the text as an String array can be regular expression used e.g.: String[] words = Text.TEXT.split("\\s+");


    public static void main(String[] args) {

        String[] wordsArray = Text.TEXT.toLowerCase().split("\\s+");

        Set<String> words = new HashSet<>();
        for (String word : wordsArray) {
            if (!words.contains(word)) {
                words.add(word);
            } else {
                System.out.println("Duplicate: " + word);
            }
        }

        System.out.println("\nThis text contains " + words.size() + " unique words");

    }
}