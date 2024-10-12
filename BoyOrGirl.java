import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = scanner.next().toCharArray();
        scanner.close();
        HashSet<Character> set = new HashSet<>();
        for (char i : inputChars) {
            set.add(i);
        }
        if (set.size() % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
