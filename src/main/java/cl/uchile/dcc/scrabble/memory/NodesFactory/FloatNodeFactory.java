package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.FloatNode;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.Hashtable;

public class FloatNodeFactory{
    public static Hashtable<Double, FloatNode> storedVariables = new Hashtable<>();

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
