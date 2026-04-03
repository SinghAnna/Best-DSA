public class _01KnapSackOptimize {

    static int knapSackOptimize(int[] wt, int[] vl, int n, int W){
        
        int[] dp = new int[W + 1];

        for (int i = 0; i < n; i++) {
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], vl[i] + dp[w - wt[i]]);
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] vl = {1,4,5,7};
        int n = wt.length;
        int W = 7;

        int ans = knapSackOptimize(wt, vl, n, W);
        System.out.println(ans);
        

    }
}
