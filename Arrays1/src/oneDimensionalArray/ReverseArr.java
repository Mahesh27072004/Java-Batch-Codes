package oneDimensionalArray;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        convertToPositive(a);
    }
    public static void convertToPositive(int[] a){
        int end = a.length-1;
        for(int i=0; i<=end; i++,end--){
            if(!(i>end)){
                int temp = a[i];
                a[i]=a[end];
                a[end]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
