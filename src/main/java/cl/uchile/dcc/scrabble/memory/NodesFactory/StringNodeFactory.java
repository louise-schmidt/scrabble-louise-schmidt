package cl.uchile.dcc.scrabble.memory.nodes;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.operators.types.StringNode;
import cl.uchile.dcc.scrabble.types.StringType;

import java.util.Hashtable;

public class StringNodeFactory{
    public static Hashtable<String, StringNode> storedVariables = new Hashtable<>();

    public static StringNode get(String value) {
        StringNode stringNode = storedVariables.get(value);
        if (stringNode == null) {
            StringType sString = StringFactory.getSString(value);
            stringNode = new StringNode(sString);
            storedVariables.put(value, stringNode);
        }
        return stringNode;
    }
}
