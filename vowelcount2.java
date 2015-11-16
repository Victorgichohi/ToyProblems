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


import java.util.HashMap;

public class VowelCount {

	public static HashMap vowelcount (String str){

		HashMap <Character, Integer> result = new HashMap <Character, Integer> ();

		int a = 0; int e = 0; int u = 0; int ii = 0; int o = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a'){
            	a= a+1;
            }

            if (ch == 'e'){
            	e= e+1;
            }

            if (ch == 'u'){
            	u= u+1;
            }

            if (ch == 'i'){
            	ii= ii+1;
            }

            if (ch == 'o'){
            	o=o+1;
           }

            result.put('a', a);
            result.put('e', e);
            result.put('u', u);
            result.put('i', ii);
            result.put('o', o);


        }


        return result;

	}

	public static void main (String [] args){

		System.out.println(VowelCount.vowelcount("Hey there you  school"));
		System.out.println(VowelCount.vowelcount("Hey there you  school mr ekimooo"));
	 }

}
