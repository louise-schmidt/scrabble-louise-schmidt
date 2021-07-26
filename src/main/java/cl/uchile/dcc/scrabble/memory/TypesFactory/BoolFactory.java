package cl.uchile.dcc.scrabble.memory.TypesFactory;

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
        boolean key = value;
        BoolType r = mapBoolType.get(key);
        if (r==null) {
            r = new BoolType(value);
            mapBoolType.put(key, r);
        }
        return r;
    }

    public HashMap<Object, BoolType> getMapBoolType() {
        return mapBoolType;
    }

}
