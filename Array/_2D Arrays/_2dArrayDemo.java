public class _2dArrayDemo {

    static int[][] matrix(int row, int col) {

        if (row <= 0 && col <= 0) {
            System.out.println("Enter row and col valid number : ");
            return new int[][] {};
        }

        if (row <= 0) {
            System.out.println("Enter valid row Number : ");
            return new int[][] {};
        }

        if (col <= 0) {
            System.out.println("Enter valid col number : ");
            return new int[][] {};
        }

        int[][] matrx = new int[row][col];

        for (int j = 0; j < matrx.length; j++) {
            for (int k = 0; k < matrx[0].length; k++) {
                matrx[j][k] = (int) (Math.random() * 15);
            }
        }

        // print 2d array
        for (int j = 0; j < matrx.length; j++) {
            for (int k = 0; k < matrx[0].length; k++) {
                System.out.print(matrx[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return matrx;
    }

    static int maxSumOFRow(int[][] matrix){

        int maxSum = Integer.MIN_VALUE;

        for (int[] is : matrix) {
            int currSum = 0;
            for (int is2 : is) {
                currSum += is2;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        
        return maxSum;
    }

    public static void main(String[] args) {
        // matrix(4, 4);
        int res = maxSumOFRow(matrix(4, 4));
        System.out.println( "Max Sum of Row  : " + res);
    }
}