public class OnesAndZerosRecursion {

     public int findMaxForm(String[] strs, int m, int n) {
        return solve(strs,0,m,n);
    }

    public int solve(String[] strs, int index, int m,int n){


        if (index == strs.length) {
            return 0;
        }

        int zeros = 0, ones = 0;

        for (char c : strs[index].toCharArray()) {
            if (c == '0') zeros++;
            else ones++;       
        }

        int skip = solve(strs, index + 1, m, ones);

        int  take = 0;
        if (zeros <= m && ones <= n) {
            take = 1 + solve(strs, index + 1, m - zeros, n - ones);
        }

        return Math.max(take, skip);
    }
    public static void main(String[] args) {
           String[] strs = {"10","0001","111001","1","0"};
           OnesAndZerosRecursion oRecursion = new OnesAndZerosRecursion();

           System.out.println(oRecursion.findMaxForm(strs, 5, 3));
    }
}
