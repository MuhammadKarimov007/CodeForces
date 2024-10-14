import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.next().toCharArray();
        char[] b = scanner.next().toCharArray();
        scanner.close();
        if (a.length != b.length) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length-i-1]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
