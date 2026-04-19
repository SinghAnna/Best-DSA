public class demo {

    static int pow (int a, int b){
        
        if (b == 1 ) {
            return a;
        }
        return  pow(a, b-1) * a;
    }

    public static void main(String[] args) {
        int ans = pow(3, 5);
        System.out.println(ans);
    }
}
