import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBridges = scanner.nextInt();
        for (int i = 0; i < numberOfBridges; i++) {
            int heightOfTheBridge = scanner.nextInt();
            if (heightOfTheBridge >= 437) {
                System.out.println("Crash " + i);
                return;
            }
        }
        System.out.println("No Crash");
    }
}
