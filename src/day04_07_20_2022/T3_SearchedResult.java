package day04_07_20_2022;

public class T3_SearchedResult {
    public static void main(String[] args) {
        String str = "About 640,000,000 results (0.78 seconds)";
        int indexOfSpace = str.indexOf(" ");
        int indexOfSpace2 = str.indexOf(" r");
        String resultNumber = str.substring(indexOfSpace, indexOfSpace2);
        int indexOfPar = str.indexOf("(");
        int indexOfPar2 = str.indexOf(")");
        String resultNumber2 = str.substring(indexOfPar + 1, indexOfPar2);
        System.out.println("resultNumber = " + resultNumber);
        System.out.println("resultNumber2 = " + resultNumber2);



    }
}
