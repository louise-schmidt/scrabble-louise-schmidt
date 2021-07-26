package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.NodeType.VarNode;

import java.util.Hashtable;

public class VarNodeFactory {

    public static Hashtable<String, VarNode> storedVariables = new Hashtable<>();

    public static VarNode getVarNode(String id){
        VarNode varNode = storedVariables.get(id);
        if (varNode == null){
            varNode = new VarNode(id);
            storedVariables.put(id, varNode);
        }
        return varNode;
    }

    private static void setVarNode(String id, TypeNode value){
        VarNode varNode = getVarNode(id);
        varNode.setValue(value);
        storedVariables.put(id, varNode);
    }

    public static void storeBinaryNodeInVarNode(String id, String value){
        setVarNode(id, NodeTypeFactory.newBinaryNode(value));
    }

    public static void storeStringNodeInVarNode(String id, String value){
        setVarNode(id, NodeTypeFactory.newStringNode(value));
    }

    public static void storeIntNodeInVarNode(String id, int value){
        setVarNode(id, NodeTypeFactory.newIntNode(value));
    }

    public static void storeBoolNodeInVarNode(String id, boolean value){
        setVarNode(id, NodeTypeFactory.newBoolNode(value));
    }

    public static void storeFloatNodeInVarNode(String id, double value){
        setVarNode(id, NodeTypeFactory.newFloatNode(value));
    }

}
