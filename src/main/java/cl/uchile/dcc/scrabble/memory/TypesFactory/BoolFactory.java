package cl.uchile.dcc.scrabble.memory.TypesFactory;
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

    public HashMap<Object, BoolType> getMapBoolType() {
        return mapBoolType;
    }

}
