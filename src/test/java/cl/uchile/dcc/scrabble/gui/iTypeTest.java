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

    private StringType str;
    private String string;
    private boolean Bool;
    private double Float;
    private int Int;
    private String Binary;
    private int seed;
    private Random rng;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        string = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        new ToStringS(string);
    }

    @Test
    void toStringS() {
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
}