import java.util.Scanner;

public class ArrayOverflowHandling {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumberFromUser(i, scanner);
        }

        System.out.println("Numbers in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static int getNumberFromUser(int index, Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a number for index " + index + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter a number for index " + index + ": ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (index < 0);
        return number;
    }
}
