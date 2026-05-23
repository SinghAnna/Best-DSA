import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubArray {

    static void generateAllSubArray(ArrayList<Integer> arr){

        List<List<Integer>> collectSubArray = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> item = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    item.add(arr.get(k));
                }
                collectSubArray.add(new ArrayList<>(item));
            }
        }

          System.out.println("All Non-empty Subarrays: " + collectSubArray);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
       

        System.out.println(arr);
       generateAllSubArray(arr);

    }
}
