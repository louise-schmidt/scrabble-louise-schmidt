package cl.uchile.dcc.scrabble.memory.NodesFactory;

import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.transformations.NodeType.BoolNode;
import cl.uchile.dcc.scrabble.types.BoolType;

import java.util.Hashtable;

public class BoolNodeFactory {
    public static Hashtable<Boolean, BoolNode> storedVariables = new Hashtable<>();

    public static BoolNode get(boolean value) {
        BoolNode boolNode = storedVariables.get(value);
        if (boolNode == null) {
            BoolType BoolType = TypeFactory.getBoolType(value);
            boolNode = new BoolNode(BoolType);
            storedVariables.put(value, boolNode);
        }
        return boolNode;
    }
}
