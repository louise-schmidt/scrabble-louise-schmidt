package cl.uchile.dcc.scrabble.factories.TypesFactory;

import cl.uchile.dcc.scrabble.types.numbers.IntType;

import java.util.HashMap;

/**
 * Factory del tipo Int de scrabble
 */
public class IntFactory {
    static HashMap<Object, IntType> mapIntType = new HashMap<>();

    /**
     * Genera un IntType a partir del parámetro entregado
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un IntType creado a partir del parametro ingresado
     */
    public static IntType newIntType(int value) {
        IntType r = mapIntType.get(value);
        if(r==null) {
            r = new IntType(value);
            mapIntType.put(value, r);
        }
        return r;
    }
}
