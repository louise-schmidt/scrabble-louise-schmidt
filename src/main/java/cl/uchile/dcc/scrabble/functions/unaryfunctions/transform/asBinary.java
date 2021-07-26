package cl.uchile.dcc.scrabble.functions.unaryfunctions.transform;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.unaryfunctions.oneNode;

public class asBinary extends oneNode {
    public asBinary(INode hijo) {
        super(hijo);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijo.evaluate().toBinaryNode();
    }
}
