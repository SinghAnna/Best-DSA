public class RecursionDemo {

    // static void printNum(int n){
    //     if (n == 0) {
    //         return;
    //     }

    //     System.out.print(n + " ");

    //     printNum(n - 1);


    // } 

    static void printNum(int n){

        if(n == 1) {
            System.out.print(n+ " ");
            return;
        }


        printNum(n - 1);
        System.out.print(n + " ");


    }

    public static void main(String[] args) {
        printNum(7);
    }
}
