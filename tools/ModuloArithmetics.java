public class ModuloArithmetics {

   static long power(long a, long b, int mod) {
    long res = 1;
    a = a % mod;

    while (b > 0) {
        if ((b & 1) == 1) {
            res = (res * a) % mod;
        }
        a = (a * a) % mod;
        b >>= 1;
    }

    return res;
}

    public static void main(String[] args) {
        long rs = power(3978432, 5, 1000000007);
        System.out.println(rs);
    }
}
