package day08_08_24_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        // get words one by one
        ArrayList<String> empty = new ArrayList<>();
        for (String s : list) {
            // check words if its length smaller than or equal 4
            boolean result = checkWordLength(s);

            // put the word another empty list if it is true
            if(result){
                empty.add(s);
            }
        }
        System.out.println("empty: " + empty);
    }
    private static boolean checkWordLength(String s){
       return s.length()<= 4;
    }
}
/*
        Task 1 : Four or less


					Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.

					Take those Strings and put them into a different ArrayList

					Ex:

					Input:
					"apples", "tree", "loop, "cat", "animal", "shortcut"

					Output:
					[ tree, loop, cat ]
         */