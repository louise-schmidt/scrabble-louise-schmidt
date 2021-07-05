package cl.uchile.dcc.scrabble.factory.numbersFactory;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class FloatFactoryTest {
    private FloatType floattype;
    private double fl = 5.55;
    private double fl2 = 8.88;

    @BeforeEach
    void setUp() {
        floattype = new FloatType(fl);
    }

    @Test
    void newFloatType() {
        FloatType f = FloatFactory.newFloatType(fl);
        FloatFactory factory = new FloatFactory();
        Map<Object, FloatType> map = factory.getMapFloatType();

        FloatType f2 = FloatFactory.newFloatType(fl);
        Map<Object, FloatType> map2 = factory.getMapFloatType();

        assertEquals(map.size(),map2.size());
        assertEquals(f.hashCode(),f2.hashCode());
        assertEquals(f,f2);

        FloatType f3 = FloatFactory.newFloatType(fl2);
        assertNotEquals(f,f3);
    }
}