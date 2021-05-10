package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TypesTest {

    private BinaryType BinaryO;
    private BoolType BoolO;
    private FloatType FloatO;
    private IntType IntO;
    private StringType stringO;

    private String binary;
    private String str;
    private boolean bool;
    private double decimal;
    private int integer;

    private char[] binary01 = {'0','1'};

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