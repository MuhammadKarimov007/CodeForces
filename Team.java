import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int solve = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (scanner.nextInt() == 1) {
                    count++;
                }
            }
            if (count>=2) solve++;
        }
        System.out.println(solve);
    }
}
