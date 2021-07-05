package cl.uchile.dcc.scrabble.factory;
import cl.uchile.dcc.scrabble.types.StringType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class StringFactoryTest {
    private StringType stringtype;
    private String str = "hola";
    private String str2 = "hola";
    private String str3 = "chao";

    @BeforeEach
    void setUp() {
        stringtype = new StringType(str);
    }

    @Test
    void newStringType() {
        StringType string = StringFactory.newStringType(str);
        StringFactory factory = new StringFactory();
        Map<String, StringType> map = factory.getMapStringType();

        StringType string2 = StringFactory.newStringType(str2);
        Map<String, StringType> map2 = factory.getMapStringType();

        assertEquals(map.size(),map2.size());
        assertEquals(string.hashCode(),string2.hashCode());
        assertEquals(string,string2);

        StringType string3 = StringFactory.newStringType(str3);
        assertNotEquals(string,string3);
    }
}