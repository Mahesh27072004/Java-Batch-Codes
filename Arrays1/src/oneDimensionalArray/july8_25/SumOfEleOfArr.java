package oneDimensionalArray.july8_25;

public class SumOfEleOfArr {
    public static int SumofAllElements(int[]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        return sum;
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};

        System.out.println(SumofAllElements(arr));
    }

}
