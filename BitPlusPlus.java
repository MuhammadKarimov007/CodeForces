import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int output = 0;
        String plusOpr = "++";
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            if (command.contains(plusOpr)) {
                output++;
            } else {
                output--;
            }
        }
        scanner.close();
        System.out.println(output);
    }
}
