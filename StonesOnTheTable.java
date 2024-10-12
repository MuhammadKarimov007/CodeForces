import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        char[] inputChars = scanner.next().toCharArray();
        byte count = 0;
        for (byte i = 0; i < n-1; i++) {
            char current = inputChars[i];
            if (inputChars[i+1] == current) count++;
        }
        System.out.println(count);
    }
}
