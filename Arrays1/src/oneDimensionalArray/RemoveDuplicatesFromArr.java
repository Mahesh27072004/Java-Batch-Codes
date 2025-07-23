package oneDimensionalArray;

import java.util.Arrays;

public class RemoveDuplicatesFromArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,3};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] arr){
        int[] count = freq(arr);
        int cnt=0;
        for(int i=0; i<count.length; i++){

            if(count[i]==-1){
                cnt++;
            }
        }
        int[] ans= new int[arr.length-cnt];
        for(int i=0 , j=0; i<arr.length;i++){
            if(count[i]!=-1){
                ans[j++]= arr[i];
            }
        }
        return ans;
    }
    public static  int[] freq(int[] ar){
        int[]  count = new int[ar.length];
        for(int i=0; i<ar.length;i++){
            int cnt=0;
            if(count[i]!=-1){
                for(int j=i+1; j< count.length;j++){

                    if(ar[i]==ar[j]){
                        cnt++;
                        count[j]=-1;
                    }
                }
                count[i]=cnt;
            }

        }
        return count;
    }
}
