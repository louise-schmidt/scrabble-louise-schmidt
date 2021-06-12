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
    private StringType Binary;
    private BoolType Bool;
    private FloatType Float;
    private IntType Int;
    private StringType string;

    private String binary;
    private String str;
    private boolean bool;
    private double floatt;
    private int integer;

    @BeforeEach
    void setUp() {
        String s="1100";
        boolean bo=true;
        double d=4.5;
        int i=60;
        String b="01010";
    }

    @Test
    void toStringS() {
        assertEquals();

    }

    @Test
    void toBool() {
    }

    @Test
    void toFloat() {
    }

    @Test
    void toInt() {
    }

    @Test
    void toBinary() {
    }

    @Test
    void sumaS() {
    }

    @Test
    void Resta() {
    }

    @Test
    void Multiplicacion() {
    }

    @Test
    void Division() {
    }

    @Test
    void Negacion() {
    }

    @Test
    void Conjuncion() {
    }

    @Test
    void Disyuncion() {
    }
}