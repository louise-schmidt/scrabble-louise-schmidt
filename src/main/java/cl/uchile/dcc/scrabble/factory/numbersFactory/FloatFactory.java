package cl.uchile.dcc.scrabble.factory.numbersFactory;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;
import java.util.HashMap;

public class FloatFactory {
    static HashMap<Object, FloatType> mapFloatType = new HashMap<>();

    public static FloatType newFloatType(double value) {
        double key = value;
        FloatType r = mapFloatType.get(key);
        if (r==null) {
            r = new FloatType(value);
            mapFloatType.put(key, r);
        }
        return r;
    }

    /**
     * @return mapa Hash donde se guarda cada objeto distinto de tipo FloatType
     */
    public HashMap<Object, FloatType> getMapFloatType() {
        return mapFloatType;
    }


}
