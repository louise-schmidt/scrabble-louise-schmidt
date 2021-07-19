package cl.uchile.dcc.scrabble.memory.TypesFactory;
import cl.uchile.dcc.scrabble.types.numbers.IntType;
import java.util.HashMap;

public class IntFactory {
    static HashMap<Object, IntType> mapIntType = new HashMap<>();

    public static IntType newIntType(int value) {
        int key = value;
        IntType r = mapIntType.get(key);
        if(r==null) {
            r = new IntType(value);
            mapIntType.put(key, r);
        }
        return r;
    }

    public HashMap<Object, IntType> getMapIntType() {
        return mapIntType;
    }
}
