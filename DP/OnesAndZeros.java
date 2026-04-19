public class OnesAndZeros {

     public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length][m + 1][n + 1];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return solve(strs,0,m,n,dp);
        
    }

    public int solve(String[] strs, int index, int m , int n,int[][][] dp){
        if (index == strs.length) {
            return 0;
        }

        if (dp[index][m][n] != -1) {
            return dp[index][m][n];
        }

        int zeros = 0, ones = 0;

        for(char c : strs[index].toCharArray()){
            if(c == '0') zeros++;
            else ones++;
        }

        // skip

        int notTake =  solve(strs, index + 1, m, n, dp);
        
        //take
        int take = 0;
        if (zeros <= m && ones <= n) {
            take = 1 + solve(strs, index + 1, m - zeros, n - ones, dp);
        }

        return dp[index][m][n] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        String[] strs = {"10","0001","111001","1","0"};
        OnesAndZeros onesAndZeros = new OnesAndZeros();
        int ans = onesAndZeros.findMaxForm(strs, 5, 3);
        System.out.println(ans);
    }
}
