package day04_07_20_2022;

public class T5_IntroForLoop {
    public static void main(String[] args) {

        String s = "Cybertek";
        //          01234567
        char firstCh = s.charAt(0);
        char secondCh = s.charAt(1);
        char thirdCh = s.charAt(2);
        char fourthCh = s.charAt(3);
        char fifthCh = s.charAt(4);
        char sixthCh = s.charAt(5);
        char seventhCh = s.charAt(6);
        for(int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            System.out.println(i + 1 + ". ch = " + ch);
        }
    }
}
