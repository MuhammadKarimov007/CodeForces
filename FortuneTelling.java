import java.util.Arrays;
import java.util.Scanner;

public class FortuneTelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte[] bq = new byte[n];
        for (byte i = 0; i < n; i++) {
            bq[i] = scanner.nextByte();
        }
        scanner.close();
        short total = 0;
        byte smOdd = Byte.MAX_VALUE;
        for (byte i = 0; i < n; i++) {
            total += bq[i];
            if (bq[i] % 2 != 0 && bq[i] < smOdd) {
                smOdd = bq[i];
            }
        }
        if (total % 2 == 0 && total != 2){
            total = (short) (total - smOdd);
        } else {
            total = 0;
        }
        System.out.println(total);
    }
}
