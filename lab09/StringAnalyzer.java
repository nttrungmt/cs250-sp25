package lab09;

import java.util.Map;
import java.util.TreeMap;

public class StringAnalyzer {
    //return a Map storing: #words, #vowels, #consonants analyzed from the sentence
    public static Map<String, Integer> countElements(String sentence) {
         //TODO add code below
    }

    //the main entry point of this application
    public static void main(String[] args) {
        String[] tests = {
                "A life spent making mistakes is not only more honorable but more useful than "
                + "a life spent doing nothing",
                "Everybody is a genius. But if you judge a fish by its ability to climb a tree, "
                + "it will live its whole life believing that it is stupid",
                "We sometimes think that poverty is only being hungry, naked and homeless. "
                + "The poverty of being unwanted, unloved and uncared for is the greatest poverty" };
        for (String str : tests) {
            System.out.println("Sentence: " + str);
            System.out.println("Analyze data: " + countElements(str));
            System.out.println();
        }
    }
}
