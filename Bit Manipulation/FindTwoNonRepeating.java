public class FindTwoNonRepeating {

    static int[] findTwoNonRepeating(int[] nums) {
        int rs = 0;

        // Step 1: XOR of all elements -> rs = a ^ b
        for (int num : nums) {
            rs ^= num;
        }

        // Step 2: find any set bit (commonly rightmost set bit)
        int mask = rs & -rs; // isolates rightmost set bit

        int p = 0;
        int q = 0;

        // Step 3: partition numbers by this bit
        for (int num : nums) {
            if ((num & mask) != 0) {
                p ^= num;
            } else {
                q ^= num;
            }
        }

        return new int[]{p, q};
    }

    public static void main(String... args) {
        int[] nums = {5, 4, 1, 4, 3, 5, 1, 2};
        int[] result = findTwoNonRepeating(nums);
        System.out.println("The two non-repeating elements are: " + result[0] + " and " + result[1]);
    }
}
