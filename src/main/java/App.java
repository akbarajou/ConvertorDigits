import java.util.Scanner;

/**
 * The main class of the application.
 * @author Akbar and Davron
 */

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);

        ui.start();
        





        reader.close();
    }
}

