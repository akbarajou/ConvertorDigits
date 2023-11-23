public class ToOctalAndViceVersa {

    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " equals to octal representation " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " equals to decimal representation " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int octalNumber = 0;
        if(decimalNumber <= 0){
            return 0;
        }
        else{
            while(decimalNumber != 0){
                octalNumber = (int) (octalNumber + (decimalNumber % 8)*Math.pow(10,i));
                decimalNumber = decimalNumber/8;
                i++;
            }
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {

        int i = 0;
        int decimalNumber = 0;
        if(octalNumber <= 0){
            return 0;
        }
        else{
            while (octalNumber != 0){
                decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8,i));
                octalNumber = octalNumber/10;
                i++;
            }
        }
        return decimalNumber;
    }
}
