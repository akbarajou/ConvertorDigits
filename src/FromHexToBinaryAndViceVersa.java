public class FromHexToBinaryAndViceVersa {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number" + binaryNumber + "equals to hexadecimal representation " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + "equals to binary representation " + toBinary(hexNumber));
    }
    public static String toHex(String binaryNumber) {

        String hexNumber = "";
        if(binaryNumber == null){
            return hexNumber;
        }
        int padding = binaryNumber.length() % 4;
        if (padding > 0) {
            binaryNumber = "0".repeat(4 - padding) + binaryNumber;
        }
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String nibble = binaryNumber.substring(i, i + 4);

            switch (nibble) {
                case "0000": hexNumber += "0"; continue;
                case "0001": hexNumber += "1"; continue;
                case "0010": hexNumber += "2"; continue;
                case "0011": hexNumber += "3"; continue;
                case "0100": hexNumber += "4"; continue;
                case "0101": hexNumber += "5"; continue;
                case "0110": hexNumber += "6"; continue;
                case "0111": hexNumber += "7"; continue;
                case "1000": hexNumber += "8"; continue;
                case "1001": hexNumber += "9"; continue;
                case "1010": hexNumber += "a"; continue;
                case "1011": hexNumber += "b"; continue;
                case "1100": hexNumber += "c"; continue;
                case "1101": hexNumber += "d"; continue;
                case "1110": hexNumber += "e"; continue;
                case "1111": hexNumber += "f"; continue;
                default:
                    throw new IllegalArgumentException("Invalid binary nibble: " + nibble);
            }
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String binaryNumber = "";
        if(hexNumber == null){
            return binaryNumber;
        }
        for(int i = 0;i<hexNumber.length();i++){
            switch(String.valueOf(hexNumber.charAt(i))){
                case "0": binaryNumber += "0000";continue;
                case "1": binaryNumber += "0001";continue;
                case "2": binaryNumber += "0010";continue;
                case "3": binaryNumber += "0011";continue;
                case "4": binaryNumber += "0100";continue;
                case "5": binaryNumber += "0101";continue;
                case "6": binaryNumber += "0110";continue;
                case "7": binaryNumber += "0111";continue;
                case "8": binaryNumber += "1000";continue;
                case "9": binaryNumber += "1001";continue;
                case "a": binaryNumber += "1010";continue;
                case "b": binaryNumber += "1011";continue;
                case "c": binaryNumber += "1100";continue;
                case "d": binaryNumber += "1101";continue;
                case "e": binaryNumber += "1110";continue;
                case "f": binaryNumber += "1111";continue;
                default:
                    throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexNumber.charAt(i));
            }
        }
        return binaryNumber;
    }
}

