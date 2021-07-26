package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.functions.NodeType.IntNode;
import cl.uchile.dcc.scrabble.types.numbers.IntType;

import java.util.Hashtable;

public class IntNodeFactory{
    public static Hashtable<Integer, IntNode> storedVariables = new Hashtable<>();

    public static IntNode get(int value) {
        IntNode intNode = storedVariables.get(value);
        if (intNode == null) {
            IntType IntType = TypeFactory.getIntType(value);
            intNode = new IntNode(IntType);
            storedVariables.put(value, intNode);
        }
        return intNode;
    }
}
