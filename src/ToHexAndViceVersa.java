public class ToHexAndViceVersa {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " equals hexadecimal representation " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " equals decimal representation " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {

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

    public static int toDecimal(String hexNumber) {

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
