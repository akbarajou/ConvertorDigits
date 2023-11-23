import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BinaryDecimal binaryDecimal;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.binaryDecimal = new BinaryDecimal();
    }

    public void start() {
        while (true) {
            printMenu();
            String command = scanner.nextLine();
            if (command.equals("E")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Enter a binary number: ");
                int binary = Integer.valueOf(scanner.nextLine());
                System.out.println("Decimal number: " + this.binaryDecimal.binaryToDecimal(binary));
            }
        }
    }


        
    

    public void printMenu() {
        System.out.println("\n1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.println("3. Hexadecimal to Binary");
        System.out.println("4. Binary to Hexadecimal");
        System.out.println("E. Exit");
    }
}