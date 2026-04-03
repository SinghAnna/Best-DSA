public class _01KnapsackWithRecursive {

    int knapSack(int[]wt, int[] vl, int n, int W  ){
        
        if (n  ==  0 || W == 0) {
            return 0;
        }

        if (wt[n-1] <= W) {
            return Math.max(vl[n-1] + knapSack(wt, vl, n-1, W - wt[n-1]), knapSack(wt, vl, n-1, W));
        }else{
            return knapSack(wt, vl, n-1, W);
        }
    }

    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] vt = {1,4,5,7};

     _01KnapsackWithRecursive kRecursive = new _01KnapsackWithRecursive();

     int ans = kRecursive.knapSack(wt, vt, wt.length, 7);

     System.out.println(ans);

    }
}
