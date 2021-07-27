package cl.uchile.dcc.scrabble.factories.TypesFactory;

import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

import java.util.Hashtable;
import java.util.Map;

/**
 * Factory del tipo Binary de scrabble
 */
public class BinaryFactory {
    public static Hashtable<String, BinaryType> mapBinaryType = new Hashtable<>();

    /**
     * Genera un BinaryType a partir del parámetro entregado
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un BinaryType creado a partir del parametro ingresado
     */
    public static BinaryType newBinaryType(String value) { ;
        BinaryType r = mapBinaryType.get(value);
        if (r==null) {
            r = new BinaryType(value);
            mapBinaryType.put(value, r);
        }
        return r;
    }
}
