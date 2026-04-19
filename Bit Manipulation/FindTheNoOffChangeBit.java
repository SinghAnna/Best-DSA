public class FindTheNoOffChangeBit {
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 12;
        int n = n1 ^ n2;
        int i = 0;

        while ((n != 0) && ((n & 1) == 0)) {
            n = n & (n - 1);
            ++i;
        }
        System.out.println(i);
    }
}
