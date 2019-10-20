import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth :");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfbirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name :");
            String name = scanner.nextLine();
            int age = 2018 - yearOfbirth;

            if (age >= 0&& age <=100) {
                System.out.println(name + " you are " + age + " years old.");
            }else {
                System.out.println("Invalid year of birth");
            }
         } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
