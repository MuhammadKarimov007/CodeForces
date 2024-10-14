import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        int total;
        if (x >= 5) {
            total = x / 5;
            if (x % 5 != 0) total++;
        } else {
            total = 1;
        }
        System.out.println(total);
    }
}
