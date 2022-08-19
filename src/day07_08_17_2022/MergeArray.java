package day07_08_17_2022;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9};
        int[] d = {10, 11, 12};
        int[] merged = mergeTwoArray(a, b);

        System.out.println("Arrays.toString(merged) = " + Arrays.toString(merged));

    }

    private static int[] mergeTwoArray(int[] a, int[] b) {
        // i need to create one dummy array
        int[] dummy = new int[a.length + b.length];

        // i need to put my first array into dummy
        int index = 0;
        for (int each : a) {
            dummy[index++] = each;
        }
        // int[] dummy = {1, 2, 3};

        // i need to put my second array into dummy

        for (int each : b) {
            dummy[index++] = each;
        }
        // int[] dummy = {1, 2, 3, 4, 5, 6};
        // i need to return my dummy
        return dummy;
    }

    public static int[] mergeArray1(int[] a, int[] b, int[] c) {
        //I need to create one dummy array
        int[] dummy = new int[a.length + b.length];

        // I need to put my first array into dummy
        int index = 0;
        for (int each : a) {
            dummy[index++] = each;
        }
        //int [] dummy={1,2,3}

        //I need to put my second array into dummy

        for (int each : b) {
            dummy[index++] = each;
        }
        //int [] dummy={1,2,3,4,5,6}
        //I need to return dummy
        //I need to put my third array into dummy

        for (int each : c) {
            dummy[index++] = each;
        }


        return dummy;
    }
  /*  public static int[] mergeArray2(int[] a, int[] b,int[] c) {
        int[] mergedTwoArray = mergeArray2(a, b);//{1,2,3,4,5,6}

        int[] mergedThreeArray = mergeArray2(mergedTwoArray, c);

        return mergedThreeArray;

    }
    public static int[] mergeArray3(int[] a, int[] b,int [] c) {

        return   mergeArray3(mergeArray3(a, b),c);


    }

   */
}
