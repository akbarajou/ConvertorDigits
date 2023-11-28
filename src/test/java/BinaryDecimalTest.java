import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for BinaryDecimal
 * @see BinaryDecimal
 */
class BinaryDecimalTest {

    @Test
    void binaryToDecimal() {
        BinaryDecimal binaryDecimal = new BinaryDecimal();

        assertEquals(5, binaryDecimal.binaryToDecimal(101));
        assertEquals(15, binaryDecimal.binaryToDecimal(1111));
    }

    @Test
    void decimalToBinary() {
        BinaryDecimal binaryDecimal = new BinaryDecimal();

        assertEquals(101, binaryDecimal.decimalToBinary(5));
        assertEquals(1111, binaryDecimal.decimalToBinary(15));
    }

}


