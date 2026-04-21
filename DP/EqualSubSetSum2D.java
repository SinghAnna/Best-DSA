public class EqualSubSetSum2D {

    public static boolean EqualSubSetSum(int[] arrs){

        int total = 0;
        int n = arrs.length;
        for (int i : arrs) {
            total += i;
        }

        if ((total & 1) == 1) {
            return false;
        }


        int target = total >> 1;

        boolean[][] dp = new boolean[n+1][target+1];


        // base case sum 0 is always True
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arrs[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - arrs[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arrs = {1,5,11,5};
        System.out.println(EqualSubSetSum(arrs));
    }

}
