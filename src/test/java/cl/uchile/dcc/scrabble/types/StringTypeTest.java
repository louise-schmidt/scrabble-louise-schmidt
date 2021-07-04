package cl.uchile.dcc.scrabble.types;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringTypeTest {

    private StringType stringtype;
    private String str = "hola";

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        stringtype = new StringType(str);
    }

    @Test
    void testConstructor() {
        var exps = new StringType(str);
        assertEquals(exps, stringtype);
    }

    @Test
    void testasString() {
        StringType prueba = stringtype.asString();
        assertEquals(stringtype, prueba);
    }
}
