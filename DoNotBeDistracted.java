import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort(); // test cases
        while (t > 0) {
            solve(scanner);
            t--;
        }
    }
    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        char[] tasks = scanner.next().toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (characterSet.contains(tasks[i])) {
                System.out.println("NO");
                return;
            }
            characterSet.add(tasks[i]);
            try {
                while (tasks[i] == tasks[i+1]) i++;
            } catch (Exception e) {
                System.out.println("YES");
                return;
            }

        }
        System.out.println("YES");
    }
}
