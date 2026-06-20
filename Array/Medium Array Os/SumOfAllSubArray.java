public class SumOfAllSubArray {

    static int sumOfAllSubArray(int[] arr){
        int result = 0;

        int n = arr.length;
        for(int i = 0; i < n; i++){
            result += (arr[i] * (i+1)*(n-i));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int rs = sumOfAllSubArray(arr);
        System.out.println(rs);
    }
}
