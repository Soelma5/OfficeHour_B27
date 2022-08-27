package day08_08_24_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        String target = "java";
        int count = 0;
        // get the  word one by one
        for (String word : words){
            //check the word which is equal with target
            // if(word.equals(target);
            boolean result = checkWord(word, target); // we want to check if word and target equal or not
            // count it if it is correct
            if(result)
                count++;
        }
        System.out.println(count);
    }

    private static boolean checkWord(String word, String target){
        return word.equals(target);
    }
}
 /*
        Task 4 : Target Words

					Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
					Ex:
					Input:
						"java", "html", “css", “java", “javascript", “selenium"
						Target: java

						Output: 2
         */


