public class MajorityElement {

    static int majorityElement(int[] nums){
        int num = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (count == 0) {
                num = nums[i];
                count = 1;
            }  else if (num == nums[i]) {
                count++;
            }else{
                count--;
            }

        }

        count = 0;
        for (int i : nums) {
            if (num == i) {
                count++;
            }
        }

        return (count >( nums.length / 2)) ? num : -1;
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};

        int ans = majorityElement(arr);

        System.out.println(ans);
    }
}