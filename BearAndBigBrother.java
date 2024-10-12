import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a = scanner.nextShort();
        short b = scanner.nextShort();
        byte count = 0;
        while (b >= a) {
            a *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
    }
}
