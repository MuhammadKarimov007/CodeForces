
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = scanner.next().toLowerCase().toCharArray();
        char[] vowelChars = {'a', 'o', 'y', 'e', 'u', 'i'};
        // "A", "O", "Y", "E", "U", "I"
        short constCount = 0;

        boolean isPresent = false;
        for (char inputChar : inputChars) {
            for (char vowelChar : vowelChars) {
                if (inputChar == vowelChar) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) constCount++;
            isPresent = false;
        }

        short index = 0;
        char[] sortedConstChars = new char[constCount];
        for (char inputChar : inputChars) {
            for (char vowelChar : vowelChars) {
                if (inputChar == vowelChar) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                sortedConstChars[index++] = inputChar;
            }
            isPresent = false;
        }

        StringBuilder builder = new StringBuilder();
        for (char ch : sortedConstChars) {
            builder.append(".").append(ch);
        }
        System.out.println(builder);

    }
}
