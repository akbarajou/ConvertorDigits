import java.util.ArrayList;

/**
 * Sep 26, 2023
 * @developed by Tangirov Akbar
 * @version 1.0
 */

public class Convertor {
    private int decimal;
    private ArrayList<Integer> binary;

    public Convertor(int decimal) {
        this.decimal = decimal;
        this.binary = new ArrayList<Integer>();
    }

    public void toBinary() {
        int decimal = this.decimal;

        while (decimal > 0) {
            int remainder = decimal % 2;
            this.binary.add(remainder);
            decimal = decimal / 2;
        }

        for (int i = this.binary.size() - 1; i >= 0; i--) {
            System.out.print(this.binary.get(i));
        }
        System.out.println();
    }
}
