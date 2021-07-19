package cl.uchile.dcc.scrabble.memory.TypesFactory.numbersFactory;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import java.util.HashMap;
import java.util.Map;

public class BinaryFactory {
    static HashMap<String, BinaryType> mapBinaryType = new HashMap<>();
    public static BinaryType newBinaryType(String value) {
        String key = value;
        BinaryType r = mapBinaryType.get(key);
        if (r==null) {
            r = new BinaryType(value);
            mapBinaryType.put(key, r);
        }
        return r;
    }

    /**
     * @return mapa Hash donde se guarda cada objeto distinto de tipo BinaryType
     */
    public Map<String, BinaryType> getMapBinaryType() {
        return mapBinaryType;
    }
}
