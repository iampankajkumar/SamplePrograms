public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("string"));
    }

    private static String reverseString(String string) {

        char[] act = string.toCharArray();
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            char temp = act[i];
            act[i] = act[length - i - 1];
            act[length - i - 1] = temp;

        }
        return new String(act);
    }

}