public class ToHexAndViceVersa {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
//        while(десятичное число не равно 0) {
//            представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
//                    + представление шестнадцатеричного числа
//            десятичное число = десятичное число / 16
//        }
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
        //for (int i = 0; i < длина входящей строки; i++) {
        //десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
        //}
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
