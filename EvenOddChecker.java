import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        
        int number = getIntegerInput();

                String result = checkEvenOrOdd(number);

                System.out.println(result);
    }

    
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close(); // Close scanner after input
        return number;
    }

    
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}