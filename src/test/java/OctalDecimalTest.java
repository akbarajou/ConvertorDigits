import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for BinaryDecimal
 * @see OctalDecimal
 */
public class OctalDecimalTest {
    @Test
    void OctalToDecimal(){
        OctalDecimal octalDecimal = new OctalDecimal();
        assertEquals(55,octalDecimal.octalToDecimal(67));
        assertEquals(66,octalDecimal.octalToDecimal(102));
    }
    @Test
    void DecimalToOctal(){
        OctalDecimal octalDecimal = new OctalDecimal();
        assertEquals(67,octalDecimal.decimalToOctal(55));
        assertEquals(102,octalDecimal.decimalToOctal(66));
    }
}
