public class MagicSquareORNot {


    static int magixMatricCount(int[][] matrix){

        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i <= n-3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                if(isMagic(matrix,i, j)){
                    count++;
                }
            }
        }

        return count;
    }

    static boolean isMagic(int[][] grid, int i, int j){
        boolean[] seen = new boolean[10];

        for (int r = i; r < i +3; r++) {
            for(int c = j; c < j+ 3; c++){
                int num = grid[r][c];
                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }


        int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];

        for (int r = i; r < i + 3; r++) {
            int rowSum = grid[r][j]
                        + grid[r][j+1]
                        + grid[r][j+2];

            if (sum != rowSum) {
                return false;
            }
        }

        for(int c = j; c < j + 3; c++){
            int colSum = grid[i][c]
                        + grid[i +1][c]
                        + grid[i + 2][c];
            if(colSum != sum){
                return false;
            }
        }

        int d1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];

        int d2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

        return d1== sum && d2 == sum;

    }



    public static void main(String[] args) {
       int[][] grid = {{4,3,8,4},{9,5,1,9},{2,7,6,2}}; 

       int res = magixMatricCount(grid);
       System.out.println(res);
    }
}
