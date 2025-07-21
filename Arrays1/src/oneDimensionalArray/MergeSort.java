package oneDimensionalArray;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] ar = {10,9,8,7,6,5,4,2};
        mergeSort(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    public static void mergeSort(int[]ar, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(ar,start,mid);
            mergeSort(ar,mid+1,end);

            merge(ar, start,mid,end);
        }
    }
    public static void merge(int[]ar, int start, int mid, int end){
        int[] ans= new int[ar.length];
        int i=start, j=mid+1, k=start ;
        while(i<=mid && j<=end){
            if(ar[i]>=ar[j]){
                ans[k++]=ar[j++];
            }else{
                ans[k++]=ar[i++];
            }
        }
        while (i<=mid){
            ans[k++]=ar[i++];
        }
        while (j<=end){
            ans[k++]=ar[j++];
        }
        for(int i1=start;i1<=end;i1++){
            ar[i1]=ans[i1];
        }
//        System.out.println((Arrays.toString(ar)));

    }

}
