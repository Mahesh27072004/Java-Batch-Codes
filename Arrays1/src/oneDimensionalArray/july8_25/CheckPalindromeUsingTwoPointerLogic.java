package oneDimensionalArray.july8_25;

public class CheckPalindromeUsingTwoPointerLogic {
    public static boolean isPalindrome(int[]arr)
    {
        int i =0;
        int j = arr.length-1;
        // example {m,a,d,a,m}
        while(i<j)
        {
            if(arr[i]==arr[j])// i-m(0),a(1)  j-m(4),a(3)
            {
                i++;// i-1,2
                j--;// j-3,2
            }
            else
                break;
        }
        return i>=j;//i-2 j-2 ->so it will return true
    }

    public static void main(String[] args)
    {
//		odd elements
        int[]arr1 = {1,2,3,4,3,2,1};
        System.out.println("Odd element array: "+isPalindrome(arr1));

//		even elements
        int[]arr2 = {1,2,3,3,2,1};
        System.out.println("Even element array: "+isPalindrome(arr2));

//		not palindromic array
        int[]arr3 = {1,2,3,5,6,3,3,1};
        System.out.println("wrong order element array: "+isPalindrome(arr3));

    }
}
