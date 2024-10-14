import java.util.Scanner;

public class RobinHelps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
    }
    private static void solve(Scanner scanner) {
        int n = scanner.nextInt(); // number of people
        int k = scanner.nextInt(); // threshold
        int budget = 0;
        int poorHelped = 0;
        for (int i = 0; i < n; i++) {
            byte money = scanner.nextByte();
            if (money >= k) {
                budget += money;
            } else if (budget > 0 && money == 0) {
                poorHelped++;
                budget--;
            }
        }
        System.out.println(poorHelped);

//        6 2
//        0 3 0 0 0 0
    }
}
