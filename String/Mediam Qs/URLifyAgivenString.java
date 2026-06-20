public class URLifyAgivenString {

    static String URLift(String s){
        StringBuilder st = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch ==  ' '){
                st.append("%");
                st.append("20");
            }else{
                st.append(ch);
            }
        }

        return st.toString();
    }
    public static void main(String[] args) {
        String s = "i love programming";
        String rs = URLift(s);
        System.out.println(rs);
    }
}
