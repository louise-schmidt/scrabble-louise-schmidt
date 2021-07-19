package cl.uchile.dcc.scrabble.memory.nodes;

import cl.uchile.dcc.scrabble.memory.TypesFactory.StringFactory;
import cl.uchile.dcc.scrabble.operators.types.BoolNode;
import cl.uchile.dcc.scrabble.types.BoolType;

import java.util.Hashtable;

public class BoolNodeFactory {
    public static Hashtable<Boolean, BoolNode> storedVariables = new Hashtable<>();

    public static BoolNode get(boolean value) {
        BoolNode boolNode = storedVariables.get(value);
        if (boolNode == null) {
            BoolType sBool = StringFactory.getSBool(value);
            boolNode = new BoolNode(sBool);
            storedVariables.put(value, boolNode);
        }
        return boolNode;
    }
}
