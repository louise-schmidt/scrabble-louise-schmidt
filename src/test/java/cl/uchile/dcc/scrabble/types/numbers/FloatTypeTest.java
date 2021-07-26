package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FloatTypeTest {

    FloatType floatype;
    double float1 = 2.0;
    double float2 = 20.0;

    IntType intype;
    int int1 = 20;

    BinaryType binarytype;
    String binary1 = "0000000000010100";

    @BeforeEach
    void setUp() {
        floatype = new FloatType(float1);
    }

    @Test
    void testConstructor() {
        var expected = new FloatType(float1);
        assertEquals(expected.hashCode(),floatype.hashCode());
        assertEquals(expected,floatype);

        var expected2 = new FloatType(1.0);
        assertNotEquals(expected2,floatype);
        assertNotEquals(expected2.hashCode(),floatype.hashCode());

    }

    @Test
    void toStringTest() {
        var expected = String.valueOf(float1);
        assertEquals(expected,floatype.toString());
    }

    @Test
    void asString() {
        assertEquals(floatype.asFloat(),floatype);
    }


    @Test
    void asFloat() {
        var expected = new StringType(String.valueOf(float1));
        assertEquals(floatype.asString(),expected);
    }


    @Test
    void operationsTest(){
        var floatvar = new FloatType(float2);
        intype = new IntType(int1);
        binarytype = new BinaryType(binary1);

        // Suma
        // FloatType + FloatType
        var sumaF = floatype.add(floatvar);
        var expectedSuma = new FloatType(float1 + float2);
        assertEquals(sumaF, expectedSuma);

        // FloatType + IntType
        var sumaI = floatype.add(intype);
        var expectedSumaI = new FloatType(float1 + int1);
        assertEquals(sumaI, expectedSumaI);

        // FloatType + BinaryType
        var sumaBi = floatype.add(binarytype);
        var expectedSumaBi = new FloatType(float1 + int1);
        assertEquals(sumaBi, expectedSumaBi);


        // Resta
        // FloatType - FloatType
        var diffF = floatype.subtract(floatvar);
        var expectedDiff = new FloatType(float1 - float2);
        assertEquals(diffF, expectedDiff);

        // FloatType - IntType
        var diffI = floatype.subtract(intype);
        var expectedDiffInt = new FloatType(float1 - int1);
        assertEquals(diffI, expectedDiffInt);

        // FloatType - BinaryType
        var diffBi = floatype.subtract(binarytype);
        var expectedDiffBi = new FloatType(float1 - int1);
        assertEquals(diffBi, expectedDiffBi);


        // Multiplicacion
        // FloatType * FloatType
        var prodF = floatype.multiply(floatvar);
        var expectedProd = new FloatType(float1 * float2);
        assertEquals(prodF, expectedProd);

        // FloatType * IntType
        var prodInt = floatype.multiply(intype);
        var expectedProdI = new FloatType(float1 * int1);
        assertEquals(prodInt, expectedProdI);

        // FloatType * BinaryType
        var prodBi = floatype.multiply(binarytype);
        var expectedProdBi = new FloatType(float1 * int1);
        assertEquals(prodBi, expectedProdBi);


        // Division
        // FloatType / FloatType
        var divF = floatype.divide(floatvar);
        var expectedDiv = new FloatType(float1 / float2);
        assertEquals(divF, expectedDiv);

        // FloatType / IntType
        var divI = floatype.divide(intype);
        var expectedDivInt = new FloatType(float1 / int1);
        assertEquals(divI, expectedDivInt);

        // FloatType / BinaryType
        var divBi = floatype.divide(binarytype);
        var expectedDivBi = new FloatType(float1 / int1);
        assertEquals(divBi, expectedDivBi);
    }
}