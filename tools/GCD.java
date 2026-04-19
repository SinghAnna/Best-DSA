public class GCD {

    static int gcd(int a, int b){
        if (b == 0) {
             return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        int ans = gcd(15, 12);
        System.out.println(ans );
    }
}
