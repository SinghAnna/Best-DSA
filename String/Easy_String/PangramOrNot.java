public class PangramOrNot {

    // static boolean pangramOrNot(String s){

    //     int[] feq = new int[26];

    //     for (char c : s.toLowerCase().toCharArray()) {
          
    //         if (c >= 'a' && c <= 'z') {
    //             feq[c-'a']++;
    //         }
                   
    //     }

    //     for (int i = 0; i < 26; i++) {
    //         if (feq[i] == 0) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }

     static boolean pangramOrNot(String s){

        for(char c = 'a'; c <= 'z'; c++){
            if (s.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
     }
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        boolean ans = pangramOrNot(s);

        System.out.println(ans);
    }
}
