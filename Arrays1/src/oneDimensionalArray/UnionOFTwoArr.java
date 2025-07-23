package oneDimensionalArray;

import java.util.Arrays;

public class UnionOFTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {2,3,11,10,12,3,7};
        int[] arr2 = {10,15,13,42,15};

        System.out.println(Arrays.toString(unionOf(arr1, arr2)));
    }
    public static int[] unionOf(int[] ar1, int[]ar2){
        int[] ar11 = RemoveDuplicatesFromArr.removeDuplicates(ar1);
        int[] ar22= RemoveDuplicatesFromArr.removeDuplicates(ar2);
        boolean[] bool = returnBooleanArr(ar11,ar22);
        int cnt=0;
        for(int i=0; i<bool.length;i++){
            if(bool[i]){
                cnt++;
            }
        }
    System.out.println(cnt);
        int[] temp = new int[ar22.length-cnt];

        for(int i=0, j=0; i< ar22.length;i++){
            if(!bool[i]){
                temp[j++]=ar22[i];
            }
        }
        int[] ans = merge(ar11,temp);
        return  BubbleSort.bubbleSort(ans);
    }
    public static boolean[] returnBooleanArr(int[] ar1, int[] ar2){
        boolean[] bool=new boolean[ar2.length];

        for(int i = 0; i < ar2.length; i++){
             for(int j=0; j<ar1.length; j++){
                 if (ar2[i] == ar1[j]) {
                     bool[i] = true;
                 }
             }
        }
        return bool;
    }
    public static int[] merge(int[]ar1, int[] ar2){
        int[] ans= new int[ar1.length+ar2.length];
        int i=0, j=0, k=0 ;
        while(i<ar1.length && j< ar2.length){
            if(ar1[i]>=ar2[j]){
                ans[k++]=ar2[j++];
            }else{
                ans[k++]=ar1[i++];
            }
        }
        while (i<ar1.length){
            ans[k++]=ar1[i++];
        }
        while (j<ar2.length){
            ans[k++]=ar2[j++];
        }
        return ans;
//        System.out.println((Arrays.toString(ar)));

    }
}
