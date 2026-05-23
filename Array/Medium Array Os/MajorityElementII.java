import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    static int[] majorityElementII(int[] nums) {
        int num1 = 0;
        int num2 = 0;

        int count1 = 0;
        int count2 = 0;

        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {

            if (num1 == num) {
                count1++;
            } else if (num2 == num) {
                count2++;
            } else if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            } 
        }

        count1 = 0;
        count2 = 0;

        for (int i : nums) {
            if (num1 == i) {
                count1++;
            } else if (num2 == i) {
                count2++;
            }
        }

        if (count1 > (nums.length / 3)) {
            ans.add(num1);
        }

        if (count2 > (nums.length / 3)) {
            ans.add(num2);
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 1, 3, 2, 1, 1 };

        int[] res = majorityElementII(nums);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
