package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTypeTest {

    private BinaryType binarytype;
    private String bi = "0100100111";

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        binarytype = new BinaryType(bi);
    }

    @Test
    void testConstructor() {
        var exps = new BinaryType(bi);
        assertEquals(exps.hashCode(),binarytype.hashCode());
        assertEquals(exps,binarytype);
    }

    @Test
    void testasString() {
        StringType prueba = binarytype.asString();
        StringType expected = new StringType(String.valueOf(bi));
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void testasInt() {
        IntType prueba = binarytype.asInt();
        assertEquals(295,prueba.getValue());
    }

    @Test
    void testasFloat() {
        FloatType prueba = binarytype.asFloat();
        assertEquals((double) 295,prueba.getValue());
    }

    @Test
    void testasBinary() {
        BinaryType prueba = binarytype.asBinary();
        assertEquals(binarytype,prueba);
    }

}