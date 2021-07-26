package cl.uchile.dcc.scrabble.types;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import cl.uchile.dcc.scrabble.types.numbers.IntType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringTypeTest {

    StringType stringtype;
    String string1 =  "veinte";
    String string2 =  "hola";

    BoolType booltype;
    boolean trueBool = true;

    IntType intype;
    int int1 = 20;

    FloatType floatype;
    double float1 = 20.0;

    BinaryType binarytype;
    String binary1 = "0000000000010100";

    @BeforeEach
    void SetUp(){
        stringtype = new StringType(string1);
    }

    @Test
    void typeConstructorTest(){
        // Igual StringType
        var expectedS = new StringType(string1);
        assertEquals(expectedS, stringtype);
        assertEquals(expectedS.hashCode(), stringtype.hashCode());

        // Diferentes
        var different = new StringType(string2);
        assertNotEquals(different, stringtype);
        assertNotEquals(different.hashCode(), stringtype.hashCode());

        // Diferentes tipos
        var different2 = new IntType(int1);
        assertNotEquals(different2, stringtype);
        assertNotEquals(different2.hashCode(), stringtype.hashCode());

    }

    @Test
    void toStringTest(){
        var expected = string1;
        assertEquals(expected, stringtype.toString());
    }

    @Test
    void stringTransformTest(){
        // StringType a StringType
        var expected = new StringType(stringtype.getValue());
        assertEquals(expected, stringtype.asString());
    }

    @Test
    void stringOperationsTest(){
        // StringType - StringType concatenacion
        var variable1 = new StringType(string2);
        var variable2 = stringtype.add(variable1);
        var expected = new StringType(stringtype.toString() + variable1.toString());
        assertEquals(expected, variable2);

        // StringType - BoolType concatenacion
        booltype = new BoolType(trueBool);
        var expectedSB = new StringType(stringtype.toString() + booltype.toString());
        var stringB = stringtype.add(booltype);
        assertEquals(expectedSB, stringB);

        // StringType-IntType concatenacion
        intype = new IntType(int1);
        var expectedSI = new StringType(stringtype.toString() + intype.toString());
        var stringI = stringtype.add(intype);
        assertEquals(expectedSI, stringI);

        // StringType-FloatType concatenacion
        floatype = new FloatType(float1);
        var expectedSF = new StringType(stringtype.toString() + floatype.toString());
        var stringF = stringtype.add(floatype);
        assertEquals(expectedSF, stringF);

        // StringType-BinaryType concatenacion
        binarytype = new BinaryType(binary1);
        var expectedSBi = new StringType(stringtype.toString() + binarytype.toString());
        var stringBi = stringtype.add(binarytype);
        assertEquals(expectedSBi, stringBi);
    }

}


