import java.util.ArrayList;

public class BoundaryElementsOfAMatrix {

    static ArrayList<Integer> boundyElement(int[][] mat){
        ArrayList<Integer> res = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        for (int j = 0; j < m; j++) {
            res.add(mat[0][j]);
        }

        for(int i = 1; i < n; i++){
            res.add(mat[i][m-1]);
        }

        for(int j = m - 2; j >= 0; j--){
            res.add(mat[n - 1][j]);
        }

        for (int i = n - 2; i >= 1; i--) {
            res.add(mat[i][0]);
        }



        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};

        ArrayList<Integer> res = boundyElement(matrix);

        System.out.println(res);
    }
}
