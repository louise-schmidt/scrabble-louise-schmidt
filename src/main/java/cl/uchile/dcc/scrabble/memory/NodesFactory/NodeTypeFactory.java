package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.transformations.NodeType.*;

public class NodeTypeFactory {

    public static BinaryNode newBinaryNode(String value){
        return BinaryNodeFactory.get(value);
    }
    public static BoolNode newBoolNode(boolean value){
        return BoolNodeFactory.get(value);
    }
    public static StringNode newStringNode(String value){
        return StringNodeFactory.get(value);
    }
    public static FloatNode newFloatNode(double value){
        return FloatNodeFactory.get(value);
    }
    public static IntNode newIntNode(int value){
        return IntNodeFactory.get(value);
    }

}
