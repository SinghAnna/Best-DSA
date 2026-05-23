import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayBySign {

     public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }

        int posId = 0;
        int negId = 0;
        int currId = 0;

        while (posId < pos.size() && negId < neg.size()) {
            if(currId % 2 == 0){
                nums[currId] = pos.get(posId);
                posId++;
                currId++;
            }else{
                nums[currId] = neg.get(negId);
                negId++;
                currId++;
            }
        }

        while (posId < pos.size()) {
             nums[currId] = pos.get(posId);
                posId++;
                currId++;
        }

        while (negId < neg.size()) {
            nums[currId] = neg.get(negId);
                negId++;
                currId++;
        }


        return nums;
    }

    public static void main(String[] args) {

        RearrangeArrayBySign reArrayBySign = new RearrangeArrayBySign();

        int[] arr = {1,2,3,-4,-1,4};

        for (int i : arr) {
             System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After operation");

        int[] ans = reArrayBySign.rearrangeArray(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
