package cl.uchile.dcc.scrabble.factories.NodesFactory;

import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.NodeType.VarNode;

import java.util.Hashtable;

/**
 * Factory de nodo variable
 */
public class VarNodeFactory {

    public static Hashtable<String, VarNode> hashtable = new Hashtable<>();

    /**
     * Getter de VarNode
     * @param id
     * corresponde al lugar que se buscará en el hashtable
     * si no existe se agrega
     * @return
     * un nodo de tipo variable con el la posicion
     */
    public static VarNode getVarNode(String id){
        VarNode varNode = hashtable.get(id);
        if (varNode == null){
            varNode = new VarNode(id);
            hashtable.put(id, varNode);
        }
        return varNode;
    }

    /**
     * Setter de VarNode
     * @param id
     * corresponde al lugar de hashtable donde se agregará el value
     * @param value
     * el valor a ingresar
     */
    private static void setVarNode(String id, TypeNode value){
        VarNode varNode = getVarNode(id);
        varNode.setValue(value);
        hashtable.put(id, varNode);
    }

    /**
     *Se agrega un BinaryNode en un VarNode
     * @param id
     * lugar del parametro a ingresar
     * @param value
     * valor del parametro a ingresar
     */
    public static void storeBinaryNodeInVarNode(String id, String value){
        setVarNode(id, NodeTypeFactory.newBinaryNode(value));
    }

    /**
     *Se agrega un StringNode en un VarNode
     * @param id
     * lugar del parametro a ingresar
     * @param value
     * valor del parametro a ingresar
     */
    public static void storeStringNodeInVarNode(String id, String value){
        setVarNode(id, NodeTypeFactory.newStringNode(value));
    }

    /**
     *Se agrega un IntNode en un VarNode
     * @param id
     * lugar del parametro a ingresar
     * @param value
     * valor del parametro a ingresar
     */
    public static void storeIntNodeInVarNode(String id, int value){
        setVarNode(id, NodeTypeFactory.newIntNode(value));
    }

    /**
     *Se agrega un BoolNode en un VarNode
     * @param id
     * lugar del parametro a ingresar
     * @param value
     * valor del parametro a ingresar
     */
    public static void storeBoolNodeInVarNode(String id, boolean value){
        setVarNode(id, NodeTypeFactory.newBoolNode(value));
    }

    /**
     *Se agrega un FloatNode en un VarNode
     * @param id
     * lugar del parametro a ingresar
     * @param value
     * valor del parametro a ingresar
     */
    public static void storeFloatNodeInVarNode(String id, double value){
        setVarNode(id, NodeTypeFactory.newFloatNode(value));
    }
}
