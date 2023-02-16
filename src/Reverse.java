import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write a word to reverse: ");
        String wordToReverse = s.next();
        StringBuilder reverse = new StringBuilder(wordToReverse);
        reverse.reverse();
        System.out.println(reverse);
    }
}