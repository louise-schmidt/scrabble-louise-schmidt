package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntTypeTest {

    IntType intype;
    int int1 = 20;
    int intneg = -20;
    int int2 = 50;

    FloatType floatype;
    double float1 = 2.0;
    double float2 = 20.0;

    BinaryType binarytype;
    String binary1 = "0000000000001010"; // 10
    int asint = 10;
    String binary3 = "0000000000010100"; // 20
    String negbinary = "1111111111101100"; // -20

    @BeforeEach
    void setUp() {
        intype = new IntType(int1);
    }

    @Test
    void testConstructor() {
        // iguales
        var expected = new IntType(int1);
        assertEquals(expected.hashCode(),intype.hashCode());
        assertEquals(expected, intype);

        // diferentes
        var otro = new IntType(int2);
        assertNotEquals(otro, intype);
        assertNotEquals(otro.hashCode(), intype.hashCode());
    }

    @Test
    void toStringTest(){
        var expected = String.valueOf(int1);
        assertEquals(expected, intype.toString());
    }

    @Test
    void testTransformaciones() {
        // IntType a StringType
        var expectedstr = new StringType(String.valueOf(int1));
        assertEquals(expectedstr,intype.asString());

        // IntType a BinaryType positivo
        var expectedbi = new BinaryType(binary3);
        assertEquals(expectedbi,intype.asBinary());

        // IntType a BinaryType negativo
        var expintneg = new IntType(intneg);
        var expectedbineg = new BinaryType(negbinary);
        assertEquals(expectedbineg,expintneg.asBinary());

        // IntType a FloatType
        var expectedfloat = new FloatType(float2);
        assertEquals(expectedfloat,intype.asFloat());

        // IntType a IntType
        var expectedint = new IntType(int1);
        assertEquals(expectedint,intype.asInt());
    }

    @Test
    void operationsTest() {
        var intest = new IntType(int2);
        floatype = new FloatType(float1);
        binarytype = new BinaryType(binary1);

        // Suma
        // IntType + IntType
        var add = intype.add(intest);
        var expected = new IntType(int1 + int2);
        assertEquals(expected, add);

        // IntType + FloatType
        var addF = intype.add(floatype);
        var expectedAddF = new FloatType(int1 + float1);
        assertEquals(expectedAddF, addF);

        // IntType + BinaryType
        var addBi = intype.add(binarytype);
        var expectedAddBi = new IntType(int1 + asint);
        assertEquals(expectedAddBi, addBi);


        // Resta
        // IntType - IntType
        var diff = intype.subtract(intest);
        var expectedDiff = new IntType(int1 - int2);
        assertEquals(expectedDiff, diff);

        // IntType - FloatType
        var diffF = intype.subtract(floatype);
        var expectedDiffF = new FloatType(int1 - float1);
        assertEquals(expectedDiffF, diffF);

        // IntType - BinaryType
        var diffBi = intype.subtract(binarytype);
        var expectedDiffBi = new IntType(int1 - asint);
        assertEquals(expectedDiffBi, diffBi);


        // Multiplicacion
        // IntType * IntType
        var prodI = intype.multiply(intest);
        var expectedProdI = new IntType(int1 * int2);
        assertEquals(expectedProdI, prodI);

        // IntType * FloatType
        var prodF = intype.multiply(floatype);
        var expectedProdF = new FloatType(int1 * float1);
        assertEquals(expectedProdF, prodF);

        // IntType * BinaryType
        var prodBi = intype.multiply(binarytype);
        var expectedProdBi = new IntType(int1 * asint);
        assertEquals(expectedProdBi, prodBi);


        // Division
        // IntType / IntType
        var divI = intype.divide(intest);
        var expectedDivI = new IntType(int1 / int2);
        assertEquals(expectedDivI, divI);

        // IntType / FloatType
        var divF = intype.divide(floatype);
        var expectedDivF = new FloatType(int1 / float1);
        assertEquals(expectedDivF, divF);

        // IntType / BinaryType
        var divBi = intype.divide(binarytype);
        var expectedDivBi = new IntType(int1 / asint);
        assertEquals(expectedDivBi, divBi);

    }
}