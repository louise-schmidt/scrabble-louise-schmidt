package cl.uchile.dcc.scrabble.factory;
import cl.uchile.dcc.scrabble.types.StringType;
import java.util.HashMap;
import java.util.Map;

public class StringFactory {
    static Map<String, StringType> mapStringType = new HashMap<>();

    public static StringType newStringType(String value) {
        String key = value;
        StringType r = mapStringType.get(key);
        if (r==null) {
            r = new StringType(value);
            mapStringType.put(key, r);
        }
        return r;
    }

    /**
     * @return mapa Hash donde se guarda cada objeto distinto de tipo StringType
     */
    public Map<String, StringType> getMapStringType() {
        return mapStringType;
    }
}
