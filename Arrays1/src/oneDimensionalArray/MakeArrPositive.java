package oneDimensionalArray;

import java.util.Arrays;

public class MakeArrPositive {
    public static void main(String[] args) {
        int[] a = {-68,-2,13,5,-4,6};
        convertToPositive(a);
    }
    public static void convertToPositive(int[] a){
        for(int i=0; i<a.length; i++){
            if(!(a[i]>0)){
                a[i] = a[i]+(a[i]*-2);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
