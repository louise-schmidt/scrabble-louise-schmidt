package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.types.StringType;

import java.util.Hashtable;

public class StringNodeFactory{
    public static Hashtable<String, StringNodeFactory> storedVariables = new Hashtable<>();

    public static StringNodeFactory get(String value) {
        StringNodeFactory stringNode = storedVariables.get(value);
        if (stringNode == null) {
            StringType sString = StringFactory.getStringType(value);
            stringNode = new StringNodeFactory(sString);
            storedVariables.put(value, stringNode);
        }
        return stringNode;
    }
}
