import java.util.ArrayList;
import java.util.List;


/**
 * 
 *   []
 ├── [1]
 │    ├── [1,2]
 │    │    └── [1,2,3]
 │    └── [1,3]
 │         └── [1,3,2]
 ├── [2]
 │    └── ...
 └── [3]
      └── ...
 * 
 */

public class Permutation2 {

    void permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backTrack(nums, new ArrayList<>(), result, used);

        System.out.println(result);
    }

    void backTrack(int[] nums, List<Integer> curr, List<List<Integer>> result, boolean[] used) {

        // Base case
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip already used elements
            if (used[i]) continue;

            // Choose
            curr.add(nums[i]);
            used[i] = true;

            // Explore
            backTrack(nums, curr, result, used);

            // Undo (backtrack)
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Permutation2 obj = new Permutation2();
        int[] nums = {1, 2, 3};
        obj.permutation(nums);
    }
}