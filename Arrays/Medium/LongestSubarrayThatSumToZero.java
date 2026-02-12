import java.util.HashMap;

public class LongestSubarrayThatSumToZero {
    public static int LongestSubarray(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // To store the prefix sum

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0){
                maxLen = i+1;
            }
            else if(map.get(sum) != null){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            else map.put(sum, i);
        }

        return maxLen;
    }
    public static void main(String[] args){
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.println(LongestSubarray(arr));
    }
}
