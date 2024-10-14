import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] inputChars = scanner.next().toCharArray();
        scanner.close();
        int result = 0;
        for (char ch : inputChars) {
            if (ch == 'A') {
                result++;
            } else {
                result--;
            }
        }
        if (result > 0) {
            System.out.println("Anton");
        } else if (result < 0) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
