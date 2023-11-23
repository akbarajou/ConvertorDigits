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

    public int decimalToBinary(int decimal) {
        int binary = 0;
        int n = 1;
        while (decimal != 0) {
            int temp = decimal % 2;
            decimal = decimal / 2;
            binary += temp * n;
            n = n * 10;
        }
        return binary;
    }


}
