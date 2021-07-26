package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.StringNode;
import cl.uchile.dcc.scrabble.types.StringType;

import java.util.Hashtable;

/**
 * Clase que genera el nodo de tipo string
 */
public class StringNodeFactory{
    public static Hashtable<String, StringNode> storedVariables = new Hashtable<>();

    /**
     * Getter de la clase
     * @param value
     * direccion a buscar en hashtable
     * @return
     * un stringNode creado a partir del parametro ingresado
     */
    public static StringNode get(String value) {
        StringNode stringNode = storedVariables.get(value);
        if (stringNode == null) {
            StringType StringType = TypeFactory.getStringType(value);
            stringNode = new StringNode(StringType);
            storedVariables.put(value, stringNode);
        }
        return stringNode;
    }
}
