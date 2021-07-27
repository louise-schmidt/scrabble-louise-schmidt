package cl.uchile.dcc.scrabble.factories.TypesFactory;

import cl.uchile.dcc.scrabble.types.StringType;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory del tipo String de scrabble
 */
public class StringFactory {
    static Map<String, StringType> mapStringType = new HashMap<>();

    /**
     * Genera un StringType a partir del parámetro entregado
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un StringType creado a partir del parametro ingresado
     */
    public static StringType newStringType(String value) {
        String key = value;
        StringType r = mapStringType.get(key);
        if (r==null) {
            r = new StringType(value);
            mapStringType.put(key, r);
        }
        return r;
    }

    public Map<String, StringType> getMapStringType() {
        return mapStringType;
    }
}
