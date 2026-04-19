import java.util.*;

public class ChampagneTower {

    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[101][101];

        dp[0][0] = poured; // top glass

        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[i][j] > 1.0) {
                    double extra = dp[i][j] - 1.0;   // FIXED LINE
                    dp[i][j] = 1.0;                 // current glass fills max up to 1 only
                    dp[i + 1][j] += extra / 2.0;    // spill left
                    dp[i + 1][j + 1] += extra / 2.0; // spill right
                }
            }
        }

        return Math.min(1.0, dp[query_row][query_glass]);
    }

    public static void main(String[] args) {

        // Example input for testing
        int poured = 10;
        int query_row = 4;
        int query_glass = 2;

        double result = champagneTower(poured, query_row, query_glass);

        System.out.println("Amount in glass (" + query_row + "," + query_glass + "): " + result);
    }
}
