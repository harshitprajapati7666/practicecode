public class RecursionString {

    public String removeOccurrences(String s, int index) {
        if (index == s.length())
            return "";
        String smallAns = removeOccurrences(s, index + 1);
        char currentCharacter = s.charAt(index);
        if (currentCharacter != 'a')
            return currentCharacter + smallAns;
        return smallAns;
    }

    public String removeOccurrences2(String s) {
        if (s.length() == 0)
            return "";
        String smallAns = removeOccurrences2(s.substring(1));
        char currentCharacter = s.charAt(0);
        if (currentCharacter != 'a')
            return currentCharacter + smallAns;
        return smallAns;
    }

    public String reverseString(String s, int index) {
        if (index == s.length())
            return "";
        String smallAns = reverseString(s, index + 1);
        return smallAns + s.charAt(index);
    }
}
