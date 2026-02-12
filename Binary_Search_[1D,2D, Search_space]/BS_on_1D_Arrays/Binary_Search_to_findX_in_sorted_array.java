package Searching_Algorithms;

public class BinarySearch {
    public static int BinarySearch(int[] arr, int target){
        int low = 0, high = arr.length-1, mid = 0;

        while(low <= high){
            mid = (low + high) /2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){        
        int[] arr = {1,3,5,6,8,10};
        int target = 8;
        System.out.println(BinarySearch(arr, target));
    }
}
