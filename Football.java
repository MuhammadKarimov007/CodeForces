import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = scanner.next().toCharArray();
        scanner.close();

        byte target = 1;
        for (byte i = 0; i < inputChars.length-1; i++) {
            if (inputChars[i] == inputChars[i+1]) {
                target++;
                if (target >= 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                target = 1;
            }
        }
        System.out.println("NO");
    }
}
