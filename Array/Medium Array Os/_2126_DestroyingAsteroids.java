import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2126_DestroyingAsteroids {
    
     public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
    
    Arrays.sort(asteroids);
    // for (int i : asteroids) {
    //     System.out.print(i + " ");
    // }

    int destroyedSum = mass;

    for (int i : asteroids) {
        if (destroyedSum < i) {
            return false;
        }

        destroyedSum += i;
    }


        return true;
    }

    public static void main(String[] args) {
        // int[] asteroids  = {3,9,19,5,21};
        int[] asteroids  = {4,9,23,4};
    boolean result = asteroidsDestroyed(5, asteroids);
    System.out.println(result);
    }
}
