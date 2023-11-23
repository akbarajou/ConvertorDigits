public class BinaryDecimal {
 

    public BinaryDecimal() {
    }

    public int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }
        return decimal;
    }

    public int decimalToBinary(int decimal) {
        int binary = 0;
        int power = 1;
        while (decimal != 0) {
            int lastDigit = decimal % 2;
            binary += lastDigit * power;
            power *= 10;
            decimal /= 2;
        }
        return binary;
    }


}
