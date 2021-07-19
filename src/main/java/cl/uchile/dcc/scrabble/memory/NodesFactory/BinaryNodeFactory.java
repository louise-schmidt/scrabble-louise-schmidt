package cl.uchile.dcc.scrabble.memory.nodes;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.operators.types.BinaryNode;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

import java.util.Hashtable;

public class BinaryNodeFactory{
    public static Hashtable<String, BinaryNode> storedVariables = new Hashtable<>();

    public static BinaryNode get(String value){
        BinaryNode binaryNode = storedVariables.get(value);
        if (binaryNode == null){
            BinaryType sBinary = StringFactory.getSBinary(value);
            binaryNode = new BinaryNode(sBinary);
            storedVariables.put(value, binaryNode);
        }
        return binaryNode;
    }
}

