package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.transformations.NodeType.BinaryNode;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

import java.util.Hashtable;

public class BinaryNodeFactory{
    public static Hashtable<String, BinaryNode> storedVariables = new Hashtable<>();

    public static BinaryNode get(String value){
        BinaryNode binaryNode = storedVariables.get(value);
        if (binaryNode == null){
            BinaryType BinaryType = TypeFactory.getBinaryType(value);
            binaryNode = new BinaryNode(BinaryType);
            storedVariables.put(value, binaryNode);
        }
        return binaryNode;
    }
}
