import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        scanner.close();
        //case1
        int max = a*b*c;

        if ((a+b)*c > max) max = (a+b)*c;
        if ((a*(b+c)) > max) max = (a*(b+c));
        if (a+b+c > max) max = a+b+c;
        if (a+(b*c) > max) max = a+(b*c);
        if ((a*b)+c > max) max = (a*b)+c;

        System.out.println(max);
    }
}