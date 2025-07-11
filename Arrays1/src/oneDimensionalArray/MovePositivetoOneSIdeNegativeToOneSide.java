package oneDimensionalArray;

import java.util.Arrays;

public class MovePositivetoOneSIdeNegativeToOneSide {
    public static void main(String[] args) {
        int[] arr ={2,0,1,-8,-2,4,-8};

        System.out.println(Arrays.toString(moveto(arr)));

    }
    public static int[] moveto(int[] arr){
        int pos=0, neg= arr.length-1;
        int[] res=new int[arr.length];
        for(int i=0; i< arr.length; i++){
            if(arr[i]>=0){
                res[pos]=arr[i];
                pos++;
            }else{
                res[neg]=arr[i];
                neg--;
            }
        }
        return res;
    }
}
