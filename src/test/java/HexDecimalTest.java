import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for BinaryDecimal
 * @see HexDecimal
 */
class HexDecimalTest {
    @Test
    void HexToDecimal(){
        HexDecimal hexDecimal = new HexDecimal();
        assertEquals(String.valueOf(10),hexDecimal.decimalToHex(16));
        assertEquals("b",hexDecimal.decimalToHex(11));
    }
    @Test
    void DecimalToHex(){
        HexDecimal hexDecimal = new HexDecimal();
        assertEquals(16,hexDecimal.hexToDecimal(String.valueOf(10)));
        assertEquals(11,hexDecimal.hexToDecimal("b"));
    }
}
