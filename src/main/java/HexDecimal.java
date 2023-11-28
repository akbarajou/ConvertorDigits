
/**
 * The HexDecimal class provides methods for converting decimal numbers to hexadecimal and vice versa.
 * It contains a constant string HEX representing the hexadecimal digits.
 * 
 * @developed by Akbar and Davron
 * @@auther of this source code is Davron
 */


public class HexDecimal {
    private static final String HEX = "0123456789abcdef";
    
    public HexDecimal() {

    }

    public String decimalToHex(int decimalNumber) {

        String hexadecimal = "";
        if(decimalNumber <= 0){
            return hexadecimal;
        }
        while(decimalNumber != 0){
            hexadecimal = HEX.charAt(decimalNumber % 16) + hexadecimal;
            decimalNumber = decimalNumber/16;
        }
        return hexadecimal;
    }

    public int hexToDecimal(String hexNumber) {

        int decimal = 0;
        if(hexNumber == null){
            return decimal;
        }
        for(int i = 0;i < hexNumber.length();i++){
            decimal = 16 * decimal + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimal;
    }
}
