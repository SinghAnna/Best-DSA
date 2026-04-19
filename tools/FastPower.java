public class FastPower {

    static int fastPower(int a, int b){
        int res = 1;

        while (b > 0) {
            if ((b & 1 ) != 0) {
                res = res * a;
            }
            a = a *a;
            b = b >> 1;
        }

        return res;
    }

    public static void main(String[] args) {
        int rs = fastPower(3, 5);
        System.out.println(rs);
    }
}
