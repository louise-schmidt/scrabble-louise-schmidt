package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FloatTypeTest {

    private FloatType floattype;
    private double f = 3.14;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        floattype = new FloatType(f);
    }

    @Test
    void testConstructor() {
        var exps = new FloatType(f);
        assertEquals(exps.hashCode(),floattype.hashCode());
        assertEquals(exps,floattype);
    }

    @Test
    void EqualsFloat() {
        var uno = new FloatType(1.0);
        var dos = new FloatType(1.0);
        assertEquals(uno,dos);
    }

    @Test
    void asString() {
        StringType prueba = floattype.asString();
        StringType expected = new StringType(String.valueOf(3.14));
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void asSFloat() {
        FloatType prueba = floattype.asFloat();
        assertEquals(floattype,prueba);
    }

}