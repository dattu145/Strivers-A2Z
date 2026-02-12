import java.util.Arrays;

public class SecondLargestInAnArrayWithoutSorting {
    public static int[] secondlargestAndSmallestElement(int[] arr){
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return new int[]{secondSmallest, secondLargest};
    }
    public static void main(String[] args){
        int[] arr = {2, 5, 1, 3, 0};
        int[] result = secondlargestAndSmallestElement(arr);
        System.out.println(Arrays.toString(result));
    }
}
