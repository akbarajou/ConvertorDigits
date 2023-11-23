
/**
 * Sep 26, 2023
 * @developed by Tangirov Akbar
 * @version 1.0
 */

public class Convertor {
    private BinaryDecimal binaryDecimal;
    private HexBinary hexBinary;

    public Convertor() {
        this.binaryDecimal = new BinaryDecimal();
    }

    // BinaryDecimal
    public int binaryToDecimal(int binary) {
        return this.binaryDecimal.binaryToDecimal(binary);
    }
    
    public int decimalToBinary(int decimal) {
        return this.binaryDecimal.decimalToBinary(decimal);
    }

    
    // HexBinary
    public String toHex(String binaryNumber) {
        return this.hexBinary.toHex(binaryNumber);
    }

    public String toBinary(String hexNumber) {
        return this.hexBinary.toBinary(hexNumber);
    }

   
}
