public class Toggle_the_Case {

    public static String toggleString(String s){
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                chars[i] ^= (1 << 5);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(toggleString("Anant"));
    }
}
