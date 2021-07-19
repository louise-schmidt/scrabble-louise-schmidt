package cl.uchile.dcc.scrabble.memory.nodes;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.operators.types.IntNode;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

import java.util.Hashtable;

public class IntNodeFactory{
    public static Hashtable<Integer, IntNode> storedVariables = new Hashtable<>();

    public static IntNode get(int value) {
        IntNode intNode = storedVariables.get(value);
        if (intNode == null) {
            IntType sInt = StringFactory.getSInt(value);
            intNode = new IntNode(sInt);
            storedVariables.put(value, intNode);
        }
        return intNode;
    }
}
