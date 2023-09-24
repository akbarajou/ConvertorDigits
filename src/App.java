import java.util.Scanner;

/**
 * Sep 26, 2023
 * @developed by Tangirov Akbar
 * @version 1.0
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("== Convertor ==");
        System.out.println();

        Scanner reader = new Scanner(System.in);


        System.out.print("Enter decimal number: ");
        int decimal = Integer.valueOf(reader.nextLine());

        Convertor convertor = new Convertor(decimal);
        convertor.toBinary();






        reader.close();
    }
}
