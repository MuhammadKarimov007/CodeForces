import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        short x = 0;
        short y = 0;
        short z = 0;
        for (byte i = 0; i < n; i++) {
            x += scanner.nextByte();
            y += scanner.nextByte();
            z += scanner.nextByte();
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
