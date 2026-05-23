public class First_non_repeating {

    static char firstNonRep(String s){

        int[] feq = new int[26];
        
        for (char c : s.toCharArray()) {
            feq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (feq[c-'a'] == 1) {
                return c;
            }
        }


        return '$';
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        char res = firstNonRep(s);

        System.out.println(res);
    }
}
