package cl.uchile.dcc.scrabble.factories.NodesFactory;

import cl.uchile.dcc.scrabble.factories.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.BoolNode;
import cl.uchile.dcc.scrabble.types.BoolType;

import java.util.Hashtable;

/**
 * Clase que genera el nodo de tipo bool
 */
public class BoolNodeFactory {
    public static Hashtable<Boolean, BoolNode> storedVariables = new Hashtable<>();

    /**
     * Getter de la clase
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un boolNode creado a partir del parametro ingresado
     */
    public static BoolNode get(boolean value) {
        BoolNode boolNode = storedVariables.get(value);
        if (boolNode == null) {
            BoolType BoolType = TypeFactory.getBoolType(value);
            boolNode = new BoolNode(BoolType);
            storedVariables.put(value, boolNode);
        }
        return boolNode;
    }
}
