import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // first banana cost
        int n = scanner.nextInt(); // his initial money
        int w = scanner.nextInt(); // number of bananas he wants to buy
        int x = 0;
        for (int i = 1; i <= w; i++) {
            x += k*i;
        }
        if (n >= x) {
            System.out.println(0);
        } else {
            System.out.println(x - n);
        }
    }
}
