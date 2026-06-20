public class Search2DArray {
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
        int i = 3;
        for (int j = 0; j < matrx.length; j++) {
            for (int k = 0; k < matrx[0].length; k++) {
                matrx[j][k] = (i += 2);
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

    static int[] searchIn2DArray(int[][] num, int taget) {
        int idx = -1;

        int n = num.length;
        int m = num[0].length;

        int low = 0;
        int high = n * m - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int row = mid / m;
            int col = mid % m;

            if( num[row][col]  == taget){
               return new int[]{row,col};
            } else if( num[row][col]  < taget){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        // matrix(4, 6);

        int[] res = searchIn2DArray(matrix(4, 6), 51);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
