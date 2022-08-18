package day06_08_03_2022;

public class PrimeNumber {
    public static boolean isPrime(int number){
       if(number < 2){
           return false;
       }
       for(int  i = 2; i < number; i++) {
           if (number % i == 0) {
               return false;
           }
       }
           return true;
    }









    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(24));

    }
}
