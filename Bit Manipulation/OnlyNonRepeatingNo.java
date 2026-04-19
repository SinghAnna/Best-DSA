public class OnlyNonRepeatingNo {

    static int OnlyNonRepeatingNumber(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,4,3,5,1};
        int val = OnlyNonRepeatingNumber(nums);
        System.out.println(val);
    }
}
 