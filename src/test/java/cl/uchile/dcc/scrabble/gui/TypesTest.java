package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TypesTest {

    private StringType Binary;
    private BoolType Bool;
    private FloatType Float;
    private IntType Int;
    private StringType string;

    private String str;
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
        str = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        string = new StringType(str);
    }


}