import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        // domino is 2x1 squares

        int total = 0;
        if (m>=2) {
            int mRow = m/2;
            total = mRow * n;
            if (m%2!=0) {
                total += n/2;
            }
        } else {
            total = n/2;
        }
        System.out.println(total);


    }
}
