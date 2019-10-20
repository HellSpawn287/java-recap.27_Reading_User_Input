import java.util.Scanner;

public class Challange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int x = 0;
        int sum = 0;
        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Enter number #" + counter + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                x = scanner.nextInt();
                sum += x;
            }else {
                System.out.println("Invalid number");
            }
        }
        System.out.println("Sum of entered numbers is : "+sum);

        scanner.close();
    }
}
