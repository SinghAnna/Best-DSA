public class MajorityElement {
// Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums){

        int count = 1;
        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                val = nums[i];
                count = 1;
            }

            if (nums[i] != val) {
                count--;
            }else{
                count++;
            }


        }

        return val;
    }

    public static void main(String[] args) {

        MajorityElement mg = new MajorityElement();

        int[] nums = {2,2,1,1,1,2,2};

        int val = mg.majorityElement(nums);

        System.out.println(val);
        
    }
}