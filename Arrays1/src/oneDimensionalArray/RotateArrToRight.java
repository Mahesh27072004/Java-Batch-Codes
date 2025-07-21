package oneDimensionalArray;

import java.util.Arrays;

public class RotateArrToRight {
    public static void main(String[] args) {
        int[] ar = {8,7,6,5,4,2};
        rotateleft(ar, 3);
        System.out.println(Arrays.toString(ar));
    }
    public static void rotateleft(int[] ar, int rotations){

        for(int i=0; i<rotations;i++){
            int temp = ar[ar.length-1];
            for(int j=ar.length-2;j>=0;j--){
                ar[j+1]=ar[j];
            }
            ar[0]=temp;
        }
    }
}
