package day05_07_27_2022;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        //String s = "I like playing Football, Tennis";
        //s = s.replace(",", "");
        //String[] words = s.split(" ");

        int[] arr = {1, 2, 3};
        int var = arr[0];

        //arr[0] = arr[1];
        //arr[1] = arr[2];

        for(int i = 0; i < arr.length - 1; i++){
            //at the last
            //i=arr.length-2        i+1=arr.length-1
               arr[i]           =    arr[i + 1];
        }
        arr[arr.length - 1] = var;
        System.out.println(Arrays.toString(arr));

    }
}
// write a program that accepts an array and prints an array with the elements "rotated left"
