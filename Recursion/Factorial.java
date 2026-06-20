public class Factorial {

     static int fact(int n){
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * fact(n-1);
     }


    //    static int fact(int n){
    //     if (n == 0 || n == 1) {
    //         return n;
    //     }

    //     if(n < 0){
    //         return -1;
    //     }

    //     int num = 1;
       

    //     for (int i = 2; i <= n; i++) {
    //         num *= i;
    //     }

    //     return num;
    // }




    public static void main(String[] args) {
        int res = fact(5);
        System.out.println(res);
    }
}