package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

import java.util.Hashtable;

public class IntNodeFactory{
    public static Hashtable<Integer, IntNodeFactory> storedVariables = new Hashtable<>();

    public static IntNodeFactory get(int value) {
        IntNodeFactory intNode = storedVariables.get(value);
        if (intNode == null) {
            IntType sInt = StringFactory.getIntType(value);
            intNode = new IntNodeFactory(sInt);
            storedVariables.put(value, intNode);
        }
        return intNode;
    }
}
