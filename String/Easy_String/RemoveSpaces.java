public class RemoveSpaces {

    static String removeString(String s){
        return s = s.replace(" ", "");
    }
    public static void main(String[] args) {
        String ans = removeString("g  eeks   for ge  eeks  ");

        System.out.println(ans);
    }
}
