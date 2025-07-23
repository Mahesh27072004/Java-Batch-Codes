package oneDimensionalArray.july8_25;

public class ReverseArrLogic1 {
    public static int[] reverseArray(int[] arr)
    {
        int[]rev = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};

        int[]rev = reverseArray(arr);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        for(int i=0;i<rev.length;i++)
            System.out.print(rev[i]+" ");
    }
}
