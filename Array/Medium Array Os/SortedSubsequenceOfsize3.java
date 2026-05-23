import java.util.*;

public class SortedSubsequenceOfsize3 {

     static List<Integer> find3Numbers(int[] arr) {
        int n = arr.length;
        if (n < 3)
            return new ArrayList<>();

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int prevFirst = Integer.MAX_VALUE;

        // Iterating through the array
        for (int i = 0; i < n; i++) {
            int x = arr[i];

            // Updating first and second smallest numbers
            if (x <= first) {
                first = x;
            } else if (x <= second) {
                second = x;
                prevFirst = first;
            }
            // If a third number greater than first and second is found
            else {
                return Arrays.asList(prevFirst, second, x);
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        int[] nums = {12, 11, 10, 5, 6, 2, 30};

        System.out.println(find3Numbers(nums));
    }
}