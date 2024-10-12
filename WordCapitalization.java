import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = scanner.next().toCharArray();
        if (inputChars[0] < 65 || inputChars[0] > 90) {
            inputChars[0] = (char) (inputChars[0] - 32);
        }
        System.out.println(String.valueOf(inputChars));
    }
}
