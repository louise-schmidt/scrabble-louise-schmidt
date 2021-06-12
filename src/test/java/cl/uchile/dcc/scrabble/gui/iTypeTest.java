package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.*;

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
    void suma() {
    }

    @Test
    void resta() {
    }

    @Test
    void mult() {
    }

    @Test
    void division() {
    }

    @Test
    void negacion() {
        var expected = new BoolType(bo);

    }

}