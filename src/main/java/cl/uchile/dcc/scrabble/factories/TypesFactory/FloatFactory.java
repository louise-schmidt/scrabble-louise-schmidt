package cl.uchile.dcc.scrabble.factories.TypesFactory;

import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.HashMap;

/**
 * Factory del tipo Float de scrabble
 */
public class FloatFactory {
    public static HashMap<Object, FloatType> mapFloatType = new HashMap<>();

    /**
     * Genera un FloatType a partir del parámetro entregado
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un FloatType creado a partir del parametro ingresado
     */
    public static FloatType newFloatType(double value) {
        FloatType r = mapFloatType.get(value);
        if (r==null) {
            r = new FloatType(value);
            mapFloatType.put(value, r);
        }
        return r;
    }
}
