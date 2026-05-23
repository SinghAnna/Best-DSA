public class RotateAnArray {


     void rotateAnArray(int arr[], int d){
            int n = arr.length;

            d %= n;

            reverse(arr, 0, n-1);

            reverse(arr, 0, d-1);

            reverse(arr, d, n-1);
    }


     void reverse(int[] arr,int left, int right){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--; 
        }
     }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        RotateAnArray rotateAnArray = new RotateAnArray();

        rotateAnArray.rotateAnArray(arr, 4);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
