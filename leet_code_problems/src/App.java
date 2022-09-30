public class App {
    public static void main(String[] args) throws Exception {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        reverseString(s);
    }

    
    public static void reverseString(char[] s) {

        int j = s.length - 1;

        for (int i = 0; i < s.length / 2; i++) {

            System.out.println(i + " " + j--);

        }

    }
}
