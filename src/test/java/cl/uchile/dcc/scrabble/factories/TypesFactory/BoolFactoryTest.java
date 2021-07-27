package cl.uchile.dcc.scrabble.factories.TypesFactory;
import cl.uchile.dcc.scrabble.types.BoolType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class BoolFactoryTest {
    private BoolType booltype;
    private boolean bo = true;
    private boolean bo2 = true;
    private boolean bo3 = false;

    @BeforeEach
    void setUp() {
        booltype = new BoolType(bo);
    }

    @Test
    void newIntType() {
        BoolType bool = BoolFactory.newBoolType(bo);
        BoolFactory factory = new BoolFactory();
        Map<Object, BoolType> map = factory.getMapBoolType();

        BoolType bool2 = BoolFactory.newBoolType(bo2);
        Map<Object, BoolType> map2 = factory.getMapBoolType();

        assertEquals(map.size(),map2.size());
        assertEquals(bool.hashCode(),bool2.hashCode());
        assertEquals(bool,bool2);

        BoolType bool3 = BoolFactory.newBoolType(bo3);
        assertNotEquals(bool,bool3);
    }
}