import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexBinaryTest {
    @Test
    void binaryToHex() {
        HexBinary hexBinary = new HexBinary();
        assertEquals("0100",hexBinary.toBinary("4"));
        assertEquals("0011",hexBinary.toBinary("3"));
    }

    @Test
    void HexToBinary(){
        HexBinary hexBinary = new HexBinary();
        assertEquals("3",hexBinary.toHex("0011"));
        assertEquals("4",hexBinary.toHex("0100"));
    }
}
