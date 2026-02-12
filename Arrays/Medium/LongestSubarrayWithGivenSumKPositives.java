public class LongestSubarrayWithGivenSumKPositives {
    public static int LongestSubarray(int[] arr, int k){
        int sum = arr[0];
        int maxLen = 0;

        int left = 0;
        for(int right = 0; right < arr.length-1; right++){
            sum += arr[right];

            while(sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(LongestSubarray(arr, k));
    }
}
