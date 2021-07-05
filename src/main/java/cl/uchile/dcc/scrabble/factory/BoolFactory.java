package cl.uchile.dcc.scrabble.factory;
import cl.uchile.dcc.scrabble.types.BoolType;
import java.util.HashMap;

public class BoolFactory {
    static HashMap<Object, BoolType> mapBoolType = new HashMap<>();

    public static BoolType newBoolType(boolean value) {
        boolean key = value;
        BoolType r = mapBoolType.get(key);
        if(r==null) {
            r = new BoolType(value);
            mapBoolType.put(key, r);
        }
        return r;
    }

    /**
     * @return mapa Hash donde se guarda cada objeto distinto de tipo BoolType
     */
    public HashMap<Object, BoolType> getMapBoolType() {
        return mapBoolType;
    }

}
