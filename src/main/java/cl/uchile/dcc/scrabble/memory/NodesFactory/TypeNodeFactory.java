package cl.uchile.dcc.scrabble.memory.nodes;

import cl.uchile.dcc.scrabble.operators.types.*;

public class TypeNodeFactory {

    public static BinaryNode getBinaryNode(String value){
        return BinaryNodeFactory.get(value);
    }

    public static FloatNode getFloatNode(double value){
        return FloatNodeFactory.get(value);
    }

    public static IntNode getIntNode(int value){
        return IntNodeFactory.get(value);
    }

    public static BoolNode getBoolNode(boolean value){
        return BoolNodeFactory.get(value);
    }

    public static StringNode getStringNode(String value){
        return StringNodeFactory.get(value);
    }
}
