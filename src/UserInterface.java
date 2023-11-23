import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Convertor convertor;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.convertor = new Convertor();
    }

    public void start() {
        while (true) {
            printMenu();
            String command = scanner.nextLine();
            if (command.equals("E")) {
                break;
            }
            if (command.equals("1")) {
                System.out.print("Enter a binary number: ");
                int binary = Integer.valueOf(scanner.nextLine());
                System.out.println("Decimal number: " + this.convertor.binaryToDecimal(binary));
            } else if (command.equals("2")) {
                System.out.print("Enter a decimal number: ");
                int decimal = Integer.valueOf(scanner.nextLine());
                System.out.println("Binary number: " + this.convertor.decimalToBinary(decimal));
            } else if (command.equals("3")) {
                System.out.print("Enter a hexadecimal number: ");
                String hexNumber = scanner.nextLine();
                System.out.println("Binary number: " + this.convertor.toBinary(hexNumber));
            } else if (command.equals("4")) {
                System.out.print("Enter a binary number: ");
                String binaryNumber = scanner.nextLine();
                System.out.println("Hexadecimal number: " + this.convertor.toHex(binaryNumber));
            }
        }
    }


        
    

    public void printMenu() {
        System.out.println("\n1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.println("3. Hexadecimal to Binary");
        System.out.println("4. Binary to Hexadecimal");
        System.out.println("E. Exit");
        System.out.print("> ");
    }
}