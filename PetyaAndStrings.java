import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.next().toLowerCase().toCharArray();
        char[] b = scanner.next().toLowerCase().toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                System.out.println(1);
                return;
            } else if (a[i] < b[i]) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(0);
    }
}
