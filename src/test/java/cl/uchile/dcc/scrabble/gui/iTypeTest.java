package cl.uchile.dcc.scrabble.gui;
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
    private FloatType Float;
    private IntType Int;
    private StringType string;

    private String bi = "1010";
    private String s = "buenos dias";
    private boolean bo = true;
    private double f = 4.55;
    private int i = 8;

    @BeforeEach
    void setUp() {
        Binary = new BinaryType(bi);
        Bool = new BoolType(bo);
        Float = new FloatType(f);
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
    void EqualsFloat() {
        var uno = new FloatType(1.0);
        var dos = new FloatType(1.0);
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
    void toFloat() {
        var expected = new FloatType(f);
        assertEquals(expected,Float);
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
    @Test
    void ToIntType() {
        var expected = new IntType(i);
        assertEquals(expected,Binary.ToIntType());
    }
    @Test
    void ToFloatType() {
        var expected = new FloatType(f);
        assertEquals(expected,Int.ToFloatType());
    }
    @Test
    void ToBoolTypeBool() {
        var expected = new BoolType(true);
        var ocupado = new BoolType(true);
        assertEquals(expected,ocupado.ToBoolType());
    }
    @Test
    void ToStringTypeString() {
        var expected = new BoolType(true);
        var expected2 = new StringType("true");
        assertEquals(expected2,expected.ToStringS());
    }

    //Tests de operaciones
    @Test
    void suma() {
        var expected1 = new IntType(10);
        var expected2 = new IntType(5);
        var expected3 = new IntType(15);
        assertEquals(expected1.suma(expected2),expected3);
    }
    @Test
    void resta() {
        var expected1 = new IntType(10);
        var expected2 = new IntType(5);
        var expected3 = new IntType(5);
        assertEquals(expected1.resta(expected2),expected3);
    }
    @Test
    void mult() {
    }
    @Test
    void division() {
    }
    @Test
    void negacion() {
        var expected = new BoolType(true);
        var expected2 = new BoolType(false);
        assertEquals(expected,expected2.negacion());
    }

}