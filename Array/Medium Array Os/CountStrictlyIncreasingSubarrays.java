public class CountStrictlyIncreasingSubarrays {

    static int countIncreasing(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j  = i + 1; j < n; j++){
                if(arr[j-1] >= arr[j]){
                    break;
                }
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
         int[] arr = {1, 4, 5, 3, 7, 9};
         System.out.println(countIncreasing(arr));
    }
}
