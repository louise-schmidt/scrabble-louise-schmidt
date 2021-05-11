package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

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
    private double decimal;

    private char[] binary01 = {'0','1'};

    private int seed;
    private Random rng;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);

        binary = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, false, true, binary01, rng);
        BinaryO = new BinaryType(binary);
        BoolO = new BoolType(true);
        decimal = seed+0.05;
        FloatO = new FloatType(decimal);
        IntO = new IntType(seed);
        str = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        stringO = new StringType(str);
    }

    @RepeatedTest(20)
    void constructorTest() {

    }

    /*
    @RepeatedTest(20)
    void constructorTest() {
        var expectedPlayer = new Player(name);
        assertEquals(expectedPlayer, player);
        assertEquals(expectedPlayer.hashCode(), player.hashCode());
        String differentName;
        do {
            differentName = RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, false, null, rng);
        } while (differentName.equals(name));
        var differentNamePlayer = new Player(differentName);
        assertNotEquals(differentNamePlayer, player);
        }
     */
}