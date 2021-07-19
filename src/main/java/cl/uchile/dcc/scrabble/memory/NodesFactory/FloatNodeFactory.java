package cl.uchile.dcc.scrabble.memory.nodes;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.operators.types.FloatNode;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.Hashtable;

public class FloatNodeFactory{
    public static Hashtable<Double, FloatNode> storedVariables = new Hashtable<>();

    public static FloatNode get(double value) {
        FloatNode floatNode = storedVariables.get(value);
        if (floatNode == null) {
            FloatType sFloat = StringFactory.getSFloat(value);
            floatNode = new FloatNode(sFloat);
            storedVariables.put(value, floatNode);
        }
        return floatNode;
    }
}
