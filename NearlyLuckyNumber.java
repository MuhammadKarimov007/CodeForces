import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = scanner.next().toCharArray();
        int total = 0;
        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] == '4' || inputChars[i] == '7') total++;
        }
        if (total == 4 || total == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
