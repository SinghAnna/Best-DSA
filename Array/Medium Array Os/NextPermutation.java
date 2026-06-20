import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

    int i = nums.length - 2;

    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    if (i >= 0) {
        int j = nums.length - 1;

        while (nums[j] <= nums[i]) {
            j--;
        }

        swap(nums, i, j);
    }

    reverse(nums, i + 1, nums.length - 1);
}

static void reverse(int[] arr, int l, int r) {
    while (l < r) {
        swap(arr, l, r);
        l++;
        r--;
    }
}

static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
  
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
