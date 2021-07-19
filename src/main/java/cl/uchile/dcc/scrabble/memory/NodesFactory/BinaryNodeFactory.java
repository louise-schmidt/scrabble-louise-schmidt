package cl.uchile.dcc.scrabble.memory.NodesFactory.;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;

import java.util.Hashtable;

public class BinaryNodeFactory{
    public static Hashtable<String, BinaryNodeFactory> storedVariables = new Hashtable<>();

    public static BinaryNodeFactory get(String value){
        BinaryNodeFactory binaryNode = storedVariables.get(value);
        if (binaryNode == null){
            BinaryType sBinary = StringFactory.getBinaryType(value);
            binaryNode = new BinaryNodeFactory(sBinary);
            storedVariables.put(value, binaryNode);
        }
        return binaryNode;
    }
}

