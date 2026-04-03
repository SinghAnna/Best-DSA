import java.util.Arrays;

public class _01KnapSackMemo {

     static int dp[][];

     public static int knapSackMemo(int[]wt, int[] val, int n, int W){
        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1] <= W) {
            int take = val[n-1] + knapSackMemo(wt, val, n-1, W - wt[n -1]);
            int skip = knapSackMemo(wt, val, n-1, W);
          return  dp[n][W] = Math.max(take, skip);
        }else{
          return dp[n][W] = knapSackMemo(wt, val, n-1, W);
        }

     }

    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] vl = {1,4,5,7};

        int n = wt.length; 
        int W = 7;

        dp = new int[n+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }


        int ans = knapSackMemo(wt, vl, n, W);
        System.out.println(ans);
    }
}
