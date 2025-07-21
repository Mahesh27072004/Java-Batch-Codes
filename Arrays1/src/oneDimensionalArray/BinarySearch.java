package oneDimensionalArray;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar ={10,9,8,7,6,5,4,2};
        int ele = 8;
        QuickSort.quickSort(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
        binarySearch(ar,ele,0,ar.length-1);
    }

    public static void binarySearch(int[]ar, int ele, int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(ar[mid]==ele){
                System.out.println("the ele is present at index :"+mid);
                break;
            }else if(ar[mid]>ele){
                end=mid-1;
            }else if(ar[mid]<ele){
                start=mid+1;
            }
            if(start>end){
                break;
            }
        }
    }
}
