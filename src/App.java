import java.util.Scanner;

/**
 * Sep 26, 2023
 * @developed by Tangirov Akbar
 * @version 1.0
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);

        ui.start();







        reader.close();
    }
}
