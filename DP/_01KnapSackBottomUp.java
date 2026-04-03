public class _01KnapSackBottomUp {

    public static int knapSackBottomUp(int[] wt, int[] vl, int n, int W){
        int[][] dp = new int[n+1][W+1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i-1] <= w) {
                    dp[i][w] = Math.max(
                        vl[i-1] + dp[i-1][ w - wt[i-1]] ,
                         dp[i-1][w]);
                }else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args){
        int[] wt = {1,3,4,5};
        int[] vl = {1,4,5,7}; 
        int n = wt.length;
        int W = 7;
        int ans = knapSackBottomUp(wt, vl, n, W);
        System.out.println(ans);
    }
}