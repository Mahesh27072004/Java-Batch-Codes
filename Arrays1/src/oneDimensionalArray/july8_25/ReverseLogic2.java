package oneDimensionalArray.july8_25;

import java.util.Arrays;

public class ReverseLogic2 {
    public static int[] reverseArray(int[] arr)
    {
        int[]rev = new int[arr.length];

        for(int i=0;i<arr.length;i++)
            rev[arr.length-i-1] = arr[i];

        return rev;
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};

        int[]rev = reverseArray(arr);

        System.out.println("given array printing");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nReversed array printing");
        System.out.println(Arrays.toString(rev));
    }
}
