import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ok = 0;
        int score = -1;
        while (k > 0) {
            score = scanner.nextInt();
            if (score > 0) ok++;
            k--;
            n--;
        }
        if (score==-1) {
            System.out.println(0);
            return;
        }
        while (n > k) {
            int subScore = scanner.nextInt();
            if (subScore == score && subScore != 0) {
                ok++;
            } else {
                break;
            }
            n--;
        }

        System.out.println(ok);
    }
}
