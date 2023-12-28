
/**
 * The Convertor class is responsible for converting numbers between different number systems.
 * You have to implement the following steps when you add a new conversion method:
 * 1. Create a new object of the class responsible for the conversion.
 * 2. Initialize the object in the constructor.
 * 3. Add a new methods.
 * 
 * @developed by Akbar and Davron
 * @since Sep 26, 2023
 */


public class Convertor {
    private BinaryDecimal binaryDecimal;
    private HexBinary hexBinary;
    private HexDecimal hexDecimal;
    private OctalDecimal octalDecimal;

    public Convertor() {
        this.binaryDecimal = new BinaryDecimal();
        this.hexBinary = new HexBinary();
        this.hexDecimal = new HexDecimal();
        this.octalDecimal = new OctalDecimal();
    }

    // BinaryDecimal
    public int binaryToDecimal(int binary) {
        return this.binaryDecimal.binaryToDecimal(binary);
    }
    
    public String decimalToBinary(int decimal) {
        return this.binaryDecimal.decimalToBinary(decimal);
    }


    // HexBinary
    public String toHex(String binaryNumber) {
        return this.hexBinary.toHex(binaryNumber);
    }

    public String toBinary(String hexNumber) {
        return this.hexBinary.toBinary(hexNumber);
    }


    // HexDecimal
    public String decimalToHex(int decimalNumber) {
        return this.hexDecimal.decimalToHex(decimalNumber);
    }

    public int hexToDecimal(String hexNumber) {
        return this.hexDecimal.hexToDecimal(hexNumber);
    }


    // OctalDecimal
    public int decimalToOctal(int decimalNumber) {
        return this.octalDecimal.decimalToOctal(decimalNumber);
    }

    public int octalToDecimal(int octalNumber) {
        return this.octalDecimal.octalToDecimal(octalNumber);
    }

   
}
