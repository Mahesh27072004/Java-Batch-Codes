package oneDimensionalArray;

import java.util.Arrays;

public class IntersectionOfTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {2,3,11,10,6,12,3,7};
        int[] arr2 = {10,6,3,15,13,42,15};

        System.out.println(Arrays.toString(intersectionOf(arr1, arr2)));
    }
    public static int[] intersectionOf(int[] ar1, int[]ar2){
        int[] ar11 = RemoveDuplicatesFromArr.removeDuplicates(ar1);
        int[] ar22= RemoveDuplicatesFromArr.removeDuplicates(ar2);
        boolean[] bool = UnionOFTwoArr.returnBooleanArr(ar11,ar22);
        int cnt=0;
        for(int i=0; i<bool.length;i++){
            if(!bool[i]){
                cnt++;
            }
        }
//        System.out.println(cnt);
        int[] temp = new int[ar22.length-cnt];

        for(int i=0, j=0; i< ar22.length;i++){
            if(bool[i]){
                temp[j++]=ar22[i];
            }
        }
//        System.out.println(temp.length);
        return  BubbleSort.bubbleSort(temp);
    }
}
