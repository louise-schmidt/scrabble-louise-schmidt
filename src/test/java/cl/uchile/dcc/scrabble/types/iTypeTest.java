package cl.uchile.dcc.scrabble.types;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class iTypeTest {
    private BinaryType Binary;
    private BoolType Bool;
    private IntType Int;
    private StringType string;

    private String bi = "1010";
    private String s = "buenos dias";
    private boolean bo = true;
    private int i = 8;

    @BeforeEach
    void setUp() {
        Binary = new BinaryType(bi);
        Bool = new BoolType(bo);
        Int = new IntType(i);
        string = new StringType(s);
    }
    // Tests de Equals
    @Test
    void EqualsInt() {
        var uno = new IntType(1);
        var dos = new IntType(1);
        assertEquals(uno,dos);
    }

    @Test
    void EqualsBinary() {
        var uno = new BinaryType("1010");
        var dos = new BinaryType("1010");
        assertEquals(uno,dos);
    }
    @Test
    void EqualsString() {
        var uno = new StringType("hola");
        var dos = new StringType("hola");
        assertEquals(uno,dos);
    }
    @Test
    void EqualsBool() {
        var uno = new BoolType(true);
        var dos = new BoolType(true);
        assertEquals(uno,dos);
    }

    // Tests toAlgo
    @Test
    void toStringS() {
        var expected = new StringType(s);
        assertEquals(expected,string);
    }
    @Test
    void toBool() {
        var expected = new BoolType(bo);
        assertEquals(expected,Bool);
    }

    @Test
    void toInt() {
        var expected = new IntType(i);
        assertEquals(expected,Int);
    }
    @Test
    void toBinary() {
        var expected = new BinaryType(bi);
        assertEquals(expected,Binary);
    }

}