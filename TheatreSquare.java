import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        long nRow = 0;
        long mCol = 0;

        if (n >= a && m >= a) {
             nRow = n/a;
             mCol = m/a;
            if (n % a != 0) nRow++;
            if (m % a != 0) mCol++;
        } else if (n > a) {
            nRow = n/a;
            if (n % a != 0) nRow++;
            mCol++;
        } else if (m > a){
            mCol = m/a;
            if (m%a!=0) mCol++;
            nRow++;
        } else {
            nRow++;
            mCol++;
        }

        System.out.println(nRow*mCol);
    }
}
