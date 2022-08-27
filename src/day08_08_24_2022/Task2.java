package day08_08_24_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hiddenPasswords = new ArrayList<>();

        for(String password : passwords){
            String hiddenPassword = hidePassword(password, '*');
            hiddenPasswords.add(hiddenPassword);
        }
        System.out.println("Hidden password: " + hiddenPasswords);
    }

    private static String hidePassword(String s, char c){
        String hiddenPassword = "";
        for(int i = 0; i < s.length(); i++){
           hiddenPassword += c;
        }
        return hiddenPassword;
    }
}
 /*
        Task 2 : Hide Passwords

			        Given an arraylist of passwords (String). Hide each password as a star (*) and show the hidden password

					Ex:

					Input:
					{"one", "hi", "hold"}

					Output:
					[ ***, **, **** ]
         */

