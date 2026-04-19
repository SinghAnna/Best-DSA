public class MergeSortedArray_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m + n -1; // Last valid position
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }

    public static void main(String[] args) {

        MergeSortedArray_88 mr = new MergeSortedArray_88();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        mr.merge(num1, 3, num2, 3);

        for (int i : num1) {
            System.out.print(i + " ");
        }
    }
}