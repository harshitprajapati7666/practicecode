public class PalindromeString {

    public boolean isPalindrome(String s, int l, int r) {
        if (l >= r)
            return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }
}
