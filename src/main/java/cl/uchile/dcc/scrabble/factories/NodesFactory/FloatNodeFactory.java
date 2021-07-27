package cl.uchile.dcc.scrabble.factories.NodesFactory;

import cl.uchile.dcc.scrabble.factories.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.FloatNode;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.Hashtable;

/**
 * Clase que genera el nodo de tipo float
 */
public class FloatNodeFactory{
    public static Hashtable<Double, FloatNode> storedVariables = new Hashtable<>();

    /**
     * Getter de la clase
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un floatNode creado a partir del parametro ingresado
     */
    public static FloatNode get(double value) {
        FloatNode floatNode = storedVariables.get(value);
        if (floatNode == null) {
            FloatType FloatType = TypeFactory.getFloatType(value);
            floatNode = new FloatNode(FloatType);
            storedVariables.put(value, floatNode);
        }
        return floatNode;
    }
}
