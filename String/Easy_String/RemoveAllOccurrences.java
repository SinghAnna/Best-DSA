public class RemoveAllOccurrences {

    public static String removeAllOccurrences(String s, char c){

        if (s.length() == 0 || s == "") {
            return "";
        }

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) continue;

            st.append(s.charAt(i));    
            
        }

        return st.toString();
    }

    public static void main(String[] args) {
        String res = removeAllOccurrences("ababca", 'a');
        System.out.println(res);
    }
}
