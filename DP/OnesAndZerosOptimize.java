public class OnesAndZerosOptimize {

     public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            int zeros = 0 , ones = 0;
            
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zeros++;
                }else{
                     ones++;
                }
            }


            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i-zeros][j-ones]);
                }
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
           String[] strs = {"10","0001","111001","1","0"};
           OnesAndZerosOptimize optimize = new OnesAndZerosOptimize();

           int ans = optimize.findMaxForm(strs, 5, 3);
           System.out.println(ans);
    }
}
