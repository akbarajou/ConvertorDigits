
/**
 * The OctalDecimal class provides methods
 * for converting decimal numbers to octaland vice versa.
 * 
 * @developed by Akbar and Davron
 * @auther of this source code is Davron
 */

public class OctalDecimal {

    public OctalDecimal() {
    }

    public int decimalToOctal(int decimalNumber) {
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

    public int octalToDecimal(int octalNumber) {

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
