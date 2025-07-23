package oneDimensionalArray.july8_25;

public class CheckIfElementPresentOrNotInArray {
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};

        if(isPresentOrNot(arr, 11)){

        }else{
            System.out.println("element is not present");
        }
    }
    public static boolean isPresentOrNot(int[] arr, int ele){
        for(int i=0; i< arr.length;i++){
            if(ele==arr[i]){
                System.out.println("element is present at :"+i);
                return true;
            }
        }
        return false;
    }
}
