package cl.uchile.dcc.scrabble.memory.TypesFactory.numbersFactory;
import cl.uchile.dcc.scrabble.types.numbers.IntType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class IntFactoryTest {
    private IntType inttype;
    private int i = 5;
    private int i2 = 5;
    private int i3 = 8;

    @BeforeEach
    void setUp() {
        inttype = new IntType(i);
    }

    @Test
    void newIntType() {
        IntType in = IntFactory.newIntType(i);
        IntFactory factory = new IntFactory();
        Map<Object, IntType> map = factory.getMapIntType();

        IntType in2 = IntFactory.newIntType(i2);
        Map<Object, IntType> map2 = factory.getMapIntType();

        assertEquals(map.size(),map2.size());
        assertEquals(in.hashCode(),in2.hashCode());
        assertEquals(in,in2);

        IntType in3 = IntFactory.newIntType(i3);
        assertNotEquals(in,in3);
    }
}