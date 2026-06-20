public class OtimizeCountIncresingSunarrays {

    static int countIncreasing(int[] arr){
        int totalCount = 0;
        int currCount = 0;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            
            if(arr[i] < arr[i+1]){
                currCount++;
                totalCount += currCount;
            }else{
                currCount = 0;
            }
        }

        

        return totalCount;
    }

    public static void main(String[] args) {
         int[] arr = {1, 2,3};

         System.out.println(countIncreasing(arr));
    }
}
