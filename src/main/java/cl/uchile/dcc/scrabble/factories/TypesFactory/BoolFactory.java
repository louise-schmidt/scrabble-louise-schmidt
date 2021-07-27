package cl.uchile.dcc.scrabble.factories.TypesFactory;

import cl.uchile.dcc.scrabble.types.BoolType;

import java.util.HashMap;

/**
 * Factory del tipo Bool de scrabble
 */
public class BoolFactory {
    public static HashMap<Object, BoolType> mapBoolType = new HashMap<>();

    /**
     * Genera un BoolType a partir del parámetro entregado
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un BoolType creado a partir del parametro ingresado
     */
    public static BoolType newBoolType(boolean value) {
        BoolType r = mapBoolType.get(value);
        if (r==null) {
            r = new BoolType(value);
            mapBoolType.put(value, r);
        }
        return r;
    }
}
