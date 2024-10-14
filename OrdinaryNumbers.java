import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
    }
    private static void solve(Scanner scanner) {
        String n = scanner.next();
        int strLen = n.length();
        System.out.println(strLen * ((strLen -1) * 9));
    }
}
