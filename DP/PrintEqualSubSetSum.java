import java.util.ArrayList;
import java.util.List;

public class PrintEqualSubSetSum {

    public static void findSubset(int[] nums){
        int n = nums.length;

        int total = 0;

        for (int i : nums) {
            total += i;
        }

        if ((total & 1) == 1) {
            System.out.println("Not Possible");
            return;
        }

        int target  = total >> 1;

        boolean[][] dp = new boolean[n+1][target+1]; 

        //base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        } 
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i-1] <= j) {
                   dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]]; 
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        if (!dp[n][target]) {
            System.out.println("Not Possible");
            return;
        }

        // backTrackig to get indices
        
        List<Integer> indices = new ArrayList<>();

        int i = n;
        int j = target;

        while (i > 0 && j > 0) {
            if (dp[i-1][j]) {
                i--; // not take
            }else{
                indices.add(i - 1); // stoare index
                j -= nums[i - 1];
                i--;
            }
        }

        System.out.println("Indices : " + indices);

        List<Integer> subset = new ArrayList<>();

        for (Integer idx : indices) {
            subset.add(nums[idx]);
        }

        System.out.println("Subset : " +subset);

    }

    public static void main(String[] args) {
          int[] arr = {1, 5, 11, 5};

           findSubset(arr);
    }
}
