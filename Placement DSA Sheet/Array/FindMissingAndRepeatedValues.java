// import java.util.HashSet;
// import java.util.Set;

// public class FindMissingAndRepeatedValues {

//     public int[] findMissingAndRepeatedValues(int[][] grid){

//         Set<Integer> unique = new HashSet<>();
//         int[] ans = new int[2];

//         int n = grid.length;
//         int N = n * n;

//         int exactTotal = (N * (N + 1)) / 2;

//         int totalSum = 0;

//         int repeated = -1;

//         for (int[] row : grid) {
//             for (int num : row) {
//                 totalSum += num;

//                 if (unique.contains(num)) {
//                     repeated = num;   //  repeated मिल गया
//                 }
//                 unique.add(num);
//             }
//         }

//         int missing = exactTotal - (totalSum - repeated);

//         ans[0] = repeated;
//         ans[1] = missing;

//         return ans;
//     }

//     public static void main(String[] args) {
//         int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};

//         int[] rs = new FindMissingAndRepeatedValues().findMissingAndRepeatedValues(grid);

//         for (int i : rs) {
//             System.out.print(i + " ");
//         }
//     }
// }


    public class FindMissingAndRepeatedValues {

    public int[] findMissingAndRepeatedValues(int[][] grid){

        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSqSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSqSum += (long) num * num;
            }
        }

        long diff1 = actualSum - expectedSum;          // y - x
        long diff2 = actualSqSum - expectedSqSum;      // y² - x²

        diff2 = diff2 / diff1;                         // y + x

        int y = (int) ((diff1 + diff2) / 2);           // repeated
        int x = (int) (y - diff1);                     // missing

        return new int[]{y, x};
    }

    public static void main(String[] args) {
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};

        int[] rs = new FindMissingAndRepeatedValues().findMissingAndRepeatedValues(grid);

        for (int i : rs) {
            System.out.print(i + " ");
        }
    }
}


// public class FindMissingAndRepeatedValues {

//     public int[] findMissingAndRepeatedValues(int[][] grid){

//         int n = grid.length;
//         int N = n * n;

//         long expectedSum = (long) N * (N + 1) / 2;
//         long expectedSqSum = (long) N * (N + 1) * (2 * N + 1) / 6;

//         long actualSum = 0;
//         long actualSqSum = 0;

//         for (int[] row : grid) {
//             for (int num : row) {
//                 actualSum += num;
//                 actualSqSum += (long) num * num;
//             }
//         }

//         long diff1 = actualSum - expectedSum;          // y - x
//         long diff2 = actualSqSum - expectedSqSum;      // y² - x²

//         diff2 = diff2 / diff1;                         // y + x

//         int y = (int) ((diff1 + diff2) / 2);           // repeated
//         int x = (int) (y - diff1);                     // missing

//         return new int[]{y, x};
//     }

//     public static void main(String[] args) {
//         int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};

//         int[] rs = new FindMissingAndRepeatedValues().findMissingAndRepeatedValues(grid);

//         for (int i : rs) {
//             System.out.print(i + " ");
//         }
//     }
// }
