import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        byte k = scanner.nextByte();
        for (byte i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else {
                n = n-1;
            }
        }
        System.out.println(n);
    }
}
