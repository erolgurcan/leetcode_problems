public class _344_reverse_string {

    // Write a function that reverses a string. The input string is given as an
    // array of characters s.

    // You must do this by modifying the input array in-place with O(1) extra
    // memory.

    public static void main(String[] args) {

        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        reverseString(s);

    }

    public static void reverseString(char[] s) {

        int j = s.length - 1;

        for (int i = 0; i < s.length / 2; i++) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;

        }

    }

}
