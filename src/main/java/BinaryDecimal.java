public class BinaryDecimal {
 

    public BinaryDecimal() {
    }

    public int binaryToDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    public String decimalToBinary(int decimal) {
        if (decimal == 0) return "";
        return decimalToBinary(decimal / 2) + (decimal % 2);
    }


}
