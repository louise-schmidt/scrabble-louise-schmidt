package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.Hashtable;

public class FloatNodeFactory{
    public static Hashtable<Double, FloatNodeFactory> storedVariables = new Hashtable<>();

    public static FloatNodeFactory get(double value) {
        FloatNodeFactory floatNode = storedVariables.get(value);
        if (floatNode == null) {
            FloatType sFloat = StringFactory.getFloatType(value);
            floatNode = new FloatNodeFactory(sFloat);
            storedVariables.put(value, floatNode);
        }
        return floatNode;
    }
}
