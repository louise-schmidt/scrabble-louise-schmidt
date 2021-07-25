package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.StringType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BoolTypeTest {

    private BoolType booltype;
    boolean trueBool = true;
    boolean falseBool = false;
    boolean trueBool2 = true;
    boolean falseBool2 = false;

    BinaryType binarytype;
    String testBinary = "0000000000010100"; // 20

    @BeforeEach
    void setUp() {
        booltype = new BoolType(trueBool);
    }

    @Test
    void constructorTest(){
        // iguales
        var expected = new BoolType(trueBool);
        assertEquals(expected, booltype);
        assertEquals(expected.hashCode(), booltype.hashCode());

        // distintos
        var different = new BoolType(falseBool);
        assertNotEquals(different, booltype);
        assertNotEquals(different.hashCode(), booltype.hashCode());
    }

    @Test
    void toStringTest(){
        var expectedBool = String.valueOf(trueBool);
        assertEquals(expectedBool, booltype.toString());
    }

    @Test
    void transformationTest(){
        // BoolType a StringType
        var expected = new StringType(String.valueOf(trueBool));
        assertEquals(booltype.asString(), expected);

        // BoolType a BoolType
        var expectedBool = new BoolType(booltype.getValue());
        assertEquals(booltype.asBool(), expectedBool);
    }

    @Test
    void operationsTest(){

        var bool1 = new BoolType(falseBool);
        var bool2 = new BoolType(trueBool2);
        var bool3 = new BoolType(falseBool2);
        binarytype = new BinaryType(testBinary);

        // True BoolType AND False BoolType
        var trueANDFalse = booltype.and(bool1);
        var expected = new BoolType(false);
        assertEquals(trueANDFalse, expected);

        // True BoolType AND True BoolType
        var trueANDTrue = booltype.and(bool2);
        var expectedTT = new BoolType(true);
        assertEquals(trueANDTrue, expectedTT);

        // False BoolType AND False BoolType
        var falseANDFalse = bool1.and(bool2);
        var expectedFF= new BoolType(false);
        assertEquals(falseANDFalse, expectedFF);

        // False BoolType AND True BoolType
        var falseANDTrue = bool1.and(bool2);
        var expectedFT = new BoolType(false);
        assertEquals(falseANDTrue, expectedFT);

        // True BoolType OR False BoolType
        var trueORFalse = booltype.or(bool1);
        var expectedTF = new BoolType(true);
        assertEquals(trueORFalse, expectedTF);

        // True BoolType OR True BoolType
        var trueORTrue = booltype.or(bool2);
        var expectedTrueT = new BoolType(true);
        assertEquals(trueORTrue, expectedTrueT);

        // False BoolType OR False BoolType
        var falseORFalse = bool1.or(bool3);
        var expectedForF = new BoolType(false);
        assertEquals(falseORFalse, expectedForF);

        // False BoolType OR True BoolType
        var falseORTrue = bool1.or(bool2);
        var expectedForT = new BoolType(true);
        assertEquals(falseORTrue, expectedForT);

        // True BoolType AND BoolType
        var trueANDBinario = booltype.and(binarytype);
        var expectedTandBi = new BinaryType(testBinary);
        assertEquals(trueANDBinario, expectedTandBi);

        // False BoolType AND BinaryType
        var falseANDBinario = bool1.and(binarytype);
        var expectedFandBi = new BinaryType("0000000000000000");
        assertEquals(falseANDBinario, expectedFandBi);

        // True BoolType OR BinaryType
        var trueORBinario = booltype.or(binarytype);
        var expectedTorBi = new BinaryType("1111111111111111");
        assertEquals(trueORBinario, expectedTorBi);

        // False BoolType OR BinaryType
        var falseORBinario = bool1.or(binarytype);
        var expectedForBi = new BinaryType(testBinary);
        assertEquals(falseORBinario, expectedForBi);

        // Negacion True BoolType
        var trueBoolNot = booltype.not();
        assertFalse(trueBoolNot.getValue());

        // Negacion False BoolType
        var falseBoolNot = bool1.not();
        assertTrue(falseBoolNot.getValue());
    }
}
