
import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] nArray = new int[n];

            // register to the array
            for (int j = 0; j < n; j++) {
                nArray[j] = scanner.nextInt();
            }

            // check whether it is sorted and find the minDiff
            int  minDiff = Integer.MAX_VALUE;
            int y = 0;
            int z = 0;
            for (int j = 0; j < n-1; j++) {
                if (nArray[j] > nArray[j+1]) {
                    minDiff = -1;
                    break;
                }

                int diff = nArray[j+1] - nArray[j];
                if (diff < minDiff) {
                    minDiff = diff;
                    y = nArray[j];
                    z = nArray[j+1];
                }
            }

            if (minDiff == -1) {
                System.out.println(0);
            } else {
                if (minDiff % 2 == 0) {
                    System.out.println((z - (y - 2)) / 2);
                } else {
                    System.out.println((z - (y-1)) / 2);
                }
            }

        }
    }
}
