public class StringMethods {

    public static boolean hasLetter(String word, char letter) {
        for (char c : word.toCharArray()) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }
}
