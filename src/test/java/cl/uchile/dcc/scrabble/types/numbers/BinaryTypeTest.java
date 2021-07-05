package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
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
    void asString() {
        StringType prueba = binarytype.asString();
        StringType expected = new StringType(String.valueOf(bi));
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void asInt() {
        IntType prueba = binarytype.asInt();
        assertEquals(295,prueba.getValue());
    }

    @Test
    void asFloat() {
        FloatType i = new FloatType(295);
        FloatType prueba = binarytype.asFloat();
        assertEquals(i,prueba);
    }


    @Test
    void asBinary() {
        BinaryType prueba = binarytype.asBinary();
        assertEquals(binarytype,prueba);
    }

}