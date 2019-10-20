import java.util.Scanner;

public class Minimum_Maximum_Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int number = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number #" + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    max = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
        }
        System.out.println("Minimum is : " + min);
        System.out.println("Maximum is : " + max);
        scanner.close();
    }
}
