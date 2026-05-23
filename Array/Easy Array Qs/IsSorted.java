public class IsSorted {


   static boolean isSorted(int[] arr){

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrr = {10,20,100,40,50,60,70,80};

        System.out.println(isSorted(arrr));
    }
}
