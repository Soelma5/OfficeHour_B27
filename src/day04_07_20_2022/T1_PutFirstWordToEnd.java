package day04_07_20_2022;

public class T1_PutFirstWordToEnd {
    public static void main(String[] args) {
        String sentence = "Java is a fun language";

        int indexOfSpace = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, indexOfSpace);

        System.out.println("First word is " + firstWord);

        String otherWords = sentence.substring(indexOfSpace + 1);
        System.out.println("OtherWords = " + otherWords);
    }
}
