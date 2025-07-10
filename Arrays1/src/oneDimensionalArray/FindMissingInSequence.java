package oneDimensionalArray;

public class FindMissingInSequence {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,9,10,11};
        missingNum(arr);
    }
    public static void missingNum(int[] a){
        for(int i=0; i<a.length-1; i++){
            if(a[i]+1!=a[i+1]){
                System.out.println(a[i]+1);
            }
        }
    }
}
