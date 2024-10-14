import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = scanner.next().toCharArray();
        scanner.close();
        byte up = 0;
        byte low = 0;
        for (char ch : inputChars) {
            if (ch >= 65 && ch <= 90) {
                up++;
            } else {
                low++;
            }
        }
        if (up <= low) {
            System.out.println(String.valueOf(inputChars).toLowerCase());
        } else {
            System.out.println(String.valueOf(inputChars).toUpperCase());
        }
    }
}
