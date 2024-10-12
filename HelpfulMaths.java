import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] exp = scanner.nextLine().split("\\+");
        int[] intExp = new int[exp.length];
        for (int i = 0; i < exp.length; i++) {
            intExp[i] = Integer.parseInt(exp[i]);
        }
        Arrays.sort(intExp);
        StringBuilder rawOutput = new StringBuilder();
        for (int i = 0; i < intExp.length-1; i++) {
            rawOutput.append(intExp[i]).append("+");
        }
        rawOutput.append(intExp[intExp.length-1]);
        System.out.println(rawOutput);
    }
}
