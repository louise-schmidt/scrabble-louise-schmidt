package cl.uchile.dcc.scrabble.types.numbers;
import cl.uchile.dcc.scrabble.types.BoolType;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTypeTest {

    BinaryType binarytype;
    String bipositive = "0000000000010100"; // 20
    String binegative = "1111111111101100"; // -20
    String bi2 = "0000000100100111"; // 295
    String bi3 = "0000000000101000"; // 40
    String bi4 = "0000000000000111"; // 7

    BoolType booltype;
    boolean verdadero = true;
    boolean falso = false;

    IntType intype;
    int int1 = 20;
    int int2 = -20;

    double float1 = 20.0;

    @BeforeEach
    void setUp() {
        binarytype = new BinaryType(bipositive);
    }

    @Test
    void testConstructor() {
        var expected = new BinaryType(bipositive);
        assertEquals(expected.hashCode(),binarytype.hashCode());
        assertEquals(expected,binarytype);

        var expected2 = new BinaryType(bi2);
        assertNotEquals(expected2.hashCode(),binarytype.hashCode());
        assertNotEquals(expected2,binarytype);
    }

    @Test
    void testToString() {
        var expected = String.valueOf(bipositive);
        assertEquals(expected, binarytype.toString());
    }

    // BinaryType a StringType
    @Test
    void transformationTest() {
        // BinaryType a StringType
        var expectedString = new StringType(bipositive);
        assertEquals(expectedString, binarytype.asString());

        // BinaryType a IntType
        // positivo
        var expectedInt = new IntType(int1);
        assertEquals(expectedInt, binarytype.asInt());

        // negativo
        var negbinary = new BinaryType(binegative);
        var expectedInt2 = new IntType(int2);
        assertEquals(expectedInt2, negbinary.asInt());

        // BinaryType a FloatType
        var expectedFloat = new FloatType(float1);
        assertEquals(expectedFloat, binarytype.asFloat());

        // BinaryType a BinaryType
        var expectedBinary = new BinaryType(bipositive);
        assertEquals(expectedBinary, binarytype.asBinary());
    }

    @Test
    void operationsTest() {
        var binario = new BinaryType(bi2);
        booltype = new BoolType(verdadero);
        var boolf = new BoolType(falso);
        intype = new IntType(int1);

        // Y
        // BinaryType AND True BoolType
        var biytrue = binarytype.and(booltype);
        var expected = new BinaryType(bipositive);
        assertEquals(expected, biytrue);



        // BinaryType AND False BoolType
        var biandfalse = binarytype.and(boolf);
        var expected2 = new BinaryType("0000000000000000");
        assertEquals(expected2, biandfalse);

        // BinaryType AND BinaryType
        var biandbi = binarytype.and(binario);
        var expected3 = new BinaryType("0000000000000100");
        assertEquals(expected3, biandbi);

        // O
        // BinaryType OR True SBool
        var biortrue = binarytype.or(booltype);
        var expected4 = new BinaryType("1111111111111111");
        assertEquals(expected4, biortrue);

        // BinaryType OR False SBool
        var biorfalse = binarytype.or(boolf);
        var expected5 = new BinaryType(bipositive);
        assertEquals(expected5, biorfalse);

        // BinaryType OR BinaryType
        var biorbi = binarytype.or(binario);
        var expected6 = new BinaryType("0000000100110111");
        assertEquals(expected6, biorbi);


        // Not
        var notbi = binarytype.not();
        var expected7 = new BinaryType("1111111111101011");
        assertEquals(expected7, notbi);


        // Suma
        // BinaryType + BinaryType
        var addbi = binarytype.add(binario);
        var expected8 = new BinaryType("0000000100111011"); // 315
        assertEquals(expected8, addbi);

        // Suma BinaryType + BinaryType
        var suma1 = new BinaryType("111");
        var suma2 = new BinaryType("11");
        var expected80 = new BinaryType("0000000000001010");
        var resultado = suma1.add(suma2);
        assertEquals(expected80, expected80);

        // BinaryType + BinaryType
        var bin1 = new BinaryType(bi3);
        var bin2 = new BinaryType(bi4);
        var add = bin1.add(bin2);
        var expected9 = new BinaryType("0000000000101111");
        assertEquals(expected9, add);

        // BinaryType + IntType
        var addint = binarytype.add(intype);
        var expected10 = new BinaryType("0000000000101000");
        assertEquals(expected10, addint);


        // Resta
        // BinaryType - BinaryType
        var diffbi = binarytype.subtract(binario);
        var expected11 = new BinaryType("1111111011101101");
        assertEquals(expected11, diffbi);

        // BinaryType - IntType
        var diffint = binarytype.subtract(intype);
        var expected12 = new BinaryType("0000000000000000");
        assertEquals(expected12, diffint);


        // Multiplicacion
        // BinaryType * BinaryType
        var prodbi = binarytype.multiply(binario);
        var expected13 = new BinaryType("0001011100001100");
        assertEquals(expected13, prodbi);

        // BinaryType * IntType
        var prodint = binarytype.multiply(intype);
        var expected14 = new BinaryType("0000000110010000");
        assertEquals(expected14, prodint);


        // Division
        // BinaryType / BinaryType
        var divbi = binarytype.divide(binario);
        var expected15 = new BinaryType("0000000000000000");
        assertEquals(expected15, divbi);

        // BinaryType / IntType
        var divint = binarytype.divide(intype);
        var expected16 = new BinaryType("0000000000000001");
        assertEquals(expected16, divint);
    }

}