package cl.uchile.dcc.scrabble.memory.TypesFactory;

import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.HashMap;

public class FloatFactory {
    public static HashMap<Object, FloatType> mapFloatType = new HashMap<>();

    public static FloatType newFloatType(double value) {
        double key = value;
        FloatType r = mapFloatType.get(key);
        if (r==null) {
            r = new FloatType(value);
            mapFloatType.put(key, r);
        }
        return r;
    }

    public HashMap<Object, FloatType> getMapFloatType() {
        return mapFloatType;
    }
}
