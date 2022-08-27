package day08_08_24_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("123", "34", "513"));

        ArrayList<Integer> results = new ArrayList<>();

        for(String number : numbers){
            Integer sum = getValue(number);
            results.add(sum);
        }
        System.out.println("results: " + results);
    }
    private static Integer getValue(String number){

        int sum = 0;

        for(int i = 0; i < number.length(); i++){
            String c = "" + number.charAt(i);
            // convert String to integer
            Integer integer = Integer.valueOf(c);
            // need to add this value inside the sum
            sum += integer;
        }
        return sum;
    }
    //get the string one by one

    // get the string value of integer

    // put the sum inside the integer list
}
/*
        Task 3 : String numbers to sum

					Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.

					Ex:

					Input:
					“123”, “34”, “513”

					Output:
					[ 6, 7, 9 ]
         */