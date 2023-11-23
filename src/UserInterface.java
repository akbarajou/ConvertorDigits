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
                int binary = Integer.parseInt(scanner.nextLine());
                System.out.println("Decimal number: " + this.convertor.binaryToDecimal(binary));
            } else if (command.equals("2")) {
                System.out.print("Enter a decimal number: ");
                int decimal = Integer.parseInt(scanner.nextLine());
                System.out.println("Binary number: " + this.convertor.decimalToBinary(decimal));
            } else if (command.equals("3")) {
                System.out.print("Enter a hexadecimal number: ");
                String hex = scanner.nextLine();
                System.out.println("Binary number: " + this.convertor.toBinary(hex));
            } else if (command.equals("4")) {
                System.out.print("Enter a binary number: ");
                String binary = scanner.nextLine();
                System.out.println("Hexadecimal number: " + this.convertor.toHex(binary));
            } else if (command.equals("5")) {
                System.out.print("Enter a decimal number: ");
                int decimal = Integer.parseInt(scanner.nextLine());
                System.out.println("Hexadecimal number: " + this.convertor.decimalToHex(decimal));
            } else if (command.equals("6")) {
                System.out.print("Enter a hexadecimal number: ");
                String hex = scanner.nextLine();
                System.out.println("Decimal number: " + this.convertor.hexToDecimal(hex));
            } else if (command.equals("7")) {
                System.out.print("Enter a decimal number: ");
                int decimal = Integer.parseInt(scanner.nextLine());
                System.out.println("Octal number: " + this.convertor.decimalToOctal(decimal));
            } else if (command.equals("8")) {
                System.out.print("Enter a octal number: ");
                int octal = Integer.parseInt(scanner.nextLine());
                System.out.println("Decimal number: " + this.convertor.octalToDecimal(octal));
            } else {
                System.out.println("Unknown command");
            }
        }
    }


        
    

    public void printMenu() {
        System.out.println("\n1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.println("3. Hexadecimal to Binary");
        System.out.println("4. Binary to Hexadecimal");
        System.out.println("5. Decimal to Hexadecimal");
        System.out.println("6. Hexadecimal to Decimal");
        System.out.println("7. Decimal to Octal");
        System.out.println("8. Octal to Decimal");
        System.out.println("E. Exit");
        System.out.print("> ");
    }
}