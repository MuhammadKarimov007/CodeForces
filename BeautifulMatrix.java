import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int col = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int elem = scanner.nextInt();
                if (elem == 1) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        int rowMove = Math.abs(row - 3);
        int colMove = Math.abs(col - 3);
        System.out.println(rowMove+colMove);

    }
}
