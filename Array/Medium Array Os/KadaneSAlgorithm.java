public class KadaneSAlgorithm {

    static int maximumSubarrySum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i : nums) {
           currSum += i;

           maxSum = Math.max(maxSum, currSum);

           if(currSum < 0){
            currSum = 0;
           }
        }



        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int ans = maximumSubarrySum(arr);
        System.out.println(ans);
    }
}
