package oneDimensionalArray;

import java.util.Arrays;

public class RoatateArrayToLeft {
    public static void main(String[] args) {
        int[] ar = {8,7,6,5,4,2};
        rotateleft(ar, 1);
        System.out.println(Arrays.toString(ar));
    }
    public static void rotateleft(int[] ar, int rotations){

        for(int i=0; i<rotations;i++){
            int temp = ar[0];
            for(int j=1;j<ar.length;j++){
                ar[j-1]=ar[j];
            }
            ar[ar.length-1]=temp;
        }
    }

}
