package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntTypeTest {
    private IntType inttype;
    private int in = 26;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        inttype = new IntType(in);
    }

    @Test
    void testConstructor() {
        var exps = new IntType(in);
        assertEquals(exps.hashCode(),inttype.hashCode());
        assertEquals(exps, inttype);
    }

    @Test
    void asString() {
        StringType prueba = inttype.asString();
        StringType expected = new StringType(String.valueOf(in));
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void asBinary() {
        BinaryType prueba = inttype.asBinary();
        BinaryType expected = new BinaryType("011010");
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void asFloat() {
        FloatType prueba = inttype.asFloat();
        FloatType expected = new FloatType(Double.valueOf(String.valueOf(in)));
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void asInt() {
        IntType prueba = inttype.asInt();
        assertEquals(inttype,prueba);
    }
}