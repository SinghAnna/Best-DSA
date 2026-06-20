public class MatrixDiagonallyDown {

    static void printDigonalMatrixDown(int[][] matrix){

        int n = matrix.length;

        // Start First Row
        for(int col = 0; col < n; col++){
            int i = 0; int j = col;
            while (i < n && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
            }    
        }

        // start last col

        for(int row = 1; row < n; row++){
            int i = row;
            int j = n - 1;

            while(i < n && j >= 0){
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        printDigonalMatrixDown(matrix);
    }
}