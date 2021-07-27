package cl.uchile.dcc.scrabble.factories.NodesFactory;

import cl.uchile.dcc.scrabble.factories.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.BinaryNode;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

import java.util.Hashtable;

/**
 * Clase que genera el nodo de tipo binary
 */
public class BinaryNodeFactory{
    public static Hashtable<String, BinaryNode> storedVariables = new Hashtable<>();

    /**
     * Getter de la clase
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un binaryNode creado a partir del parametro ingresado
     */
    public static BinaryNode get(String value){
        BinaryNode binaryNode = storedVariables.get(value);
        if (binaryNode == null){
            BinaryType BinaryType = TypeFactory.getBinaryType(value);
            binaryNode = new BinaryNode(BinaryType);
            storedVariables.put(value, binaryNode);
        }
        return binaryNode;
    }
}
