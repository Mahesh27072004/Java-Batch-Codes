package oneDimensionalArray;

import java.util.Arrays;

public class MakeEntireArrEven {
    public static void main(String[] args) {
        int[] a = {1,2,13,5,4,6};
        convertToEven(a);
    }
    public static void convertToEven(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                a[i] = a[i]+1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
