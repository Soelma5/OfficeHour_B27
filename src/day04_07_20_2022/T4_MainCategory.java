package day04_07_20_2022;

public class T4_MainCategory {
    public static void main(String[] args) {
        String s = "https:/www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        int indexOfCSlash = s.indexOf("c/");
        String lastPart = s.substring(indexOfCSlash + 2);
        System.out.println("lastPart = " + lastPart);
        int indexOfTSlash = lastPart.indexOf("/");
        String result = lastPart.substring(0,indexOfTSlash);
        System.out.println(result);

        result = result.replace("-", " ");
        System.out.println(result);
    }
}
