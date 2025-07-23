package oneDimensionalArray;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] bubbleSort(int[] ar){
        for(int i=0;i<ar.length;i++){
            int swapnCt=0;
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    swap(ar,j,j+1);
                    swapnCt++;
                }
            }
            if(swapnCt==0){
                break;
            }
        }
        return ar;
    }
    public static void swap(int[]ar, int i, int j){
        int temp = ar[i];
        ar[i]= ar[j];
        ar[j] = temp;
    }
}
