package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BoolTypeTest {
    private BoolType booltype;
    private boolean bo = true;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        booltype = new BoolType(bo);
    }

    @Test
    void testConstructor() {
        var exps = new BoolType(bo);
        assertEquals(exps.hashCode(),booltype.hashCode());
        assertEquals(exps,booltype);
    }

    @Test
    void asString() {
        StringType prueba = booltype.asString();
        StringType expected = new StringType(String.valueOf(bo));
        assertEquals(expected.getValue(),prueba.getValue());
    }

    @Test
    void asBool() {
        BoolType prueba = booltype.asBool();
        BoolType expected = new BoolType(bo);
        assertEquals(expected.isValue(),prueba.isValue());
        assertEquals(prueba,booltype);
    }
}
