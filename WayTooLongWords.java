import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            int wordLen = word.length();
            if (wordLen > 10) {
                System.out.println(word.charAt(0) +String.valueOf(wordLen-2) + word.charAt(wordLen-1));
            } else {
                System.out.println(word);
            }
        }
    }
}
