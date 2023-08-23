import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value");
        int x = scanner.nextInt();
        System.out.println("Enter y value");
        int y = scanner.nextInt();
        System.out.println("Enter z value");
        int z = scanner.nextInt();
        System.out.println("Enter n value3");
        int n = scanner.nextInt();

        int diffL1 = Math.abs(x - n);
        int diffL2 = Math.abs(y - n);
        int diffL3 = Math.abs(z - n);


        if (diffL1 <= diffL2 && diffL1 <= diffL3) {
            System.out.println("L1");
        } else if (diffL2 <= diffL1 && diffL2 <= diffL3) {
            System.out.println("L2");
        } else {
            System.out.println("L3");
        }


        scanner.close();
    }
}
