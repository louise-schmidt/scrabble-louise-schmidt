package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.IntNode;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

import java.util.Hashtable;

/**
 * Clase que genera el nodo de tipo int
 */
public class IntNodeFactory{
    public static Hashtable<Integer, IntNode> storedVariables = new Hashtable<>();

    /**
     * Getter de la clase
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un intNode creado a partir del parametro ingresado
     */
    public static IntNode get(int value) {
        IntNode intNode = storedVariables.get(value);
        if (intNode == null) {
            IntType IntType = TypeFactory.getIntType(value);
            intNode = new IntNode(IntType);
            storedVariables.put(value, intNode);
        }
        return intNode;
    }
}
