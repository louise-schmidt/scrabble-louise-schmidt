package cl.uchile.dcc.scrabble.factories.TypesFactory.numbersFactory;
import cl.uchile.dcc.scrabble.factories.TypesFactory.BinaryFactory;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class BinaryFactoryTest {
    private BinaryType binarytype;
    private String bi = "00100111";
    private String bi2 = "010101";

    @BeforeEach
    void setUp() {
        binarytype = new BinaryType(bi);
    }

    @Test
    void newBinaryType() {
        BinaryType b = BinaryFactory.newBinaryType(bi);
        BinaryFactory factory = new BinaryFactory();
        Map<String, BinaryType> map = factory.getMapBinaryType();

        BinaryType b2 = BinaryFactory.newBinaryType(bi);
        Map<String, BinaryType> map2 = factory.getMapBinaryType();

        assertEquals(map.size(),map2.size());
        assertEquals(b.hashCode(),b2.hashCode());
        assertEquals(b,b2);

        BinaryType b3 = BinaryFactory.newBinaryType(bi2);
        assertNotEquals(b,b3);
    }
}