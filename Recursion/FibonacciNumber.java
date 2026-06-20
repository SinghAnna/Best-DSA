public class FibonacciNumber {

    static int fibonacci(int n){

        if(n == 0 || n == 1){
            return n;
        }

        int[] dp = new int[n+1];

        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = fibonacci(n -1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        int res = fibonacci(8);

        System.out.println( res);
    }
}
