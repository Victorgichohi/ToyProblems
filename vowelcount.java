// VOWEL COUNT
// LANGUAGE: JAVA

// Create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm and the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

// Given an input of a String sentence, count the number of vowels that occur in the sentence.
// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 8
// vowelMap.get('i'); // 3
// vowelMap.get('e'); // 3
// vowelMap.get('u'); // 3

import java.util.*;

public class vowelcount {

public static void main(String[] args) {

    ArrayList<String> vowels = new ArrayList<String>();

    vowels.add("mary had a little lamb");



    averageVowels(vowels);
}

public static void averageVowels(ArrayList<String> vowels) {

    System.out.println(vowels);
    int[] chars = new int[256];
    int number = 0;

    for (int i = 0; i < vowels.size(); i++)
    {
        for (char c : vowels.get(i).toCharArray()) {
            chars[c]++;
        }
    }
    System.out.println("a count: " +chars['a']);
    System.out.println("e count: " +chars['e']);
    System.out.println("i count: " +chars['i']);
    System.out.println("o count: " +chars['o']);
    System.out.println("u count: " +chars['u']);
}
}
