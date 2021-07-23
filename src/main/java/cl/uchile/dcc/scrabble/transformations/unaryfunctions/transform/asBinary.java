package cl.uchile.dcc.scrabble.transformations.unaryfunctions.transform;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.transformations.unaryfunctions.oneNode;

public class asBinary extends oneNode {
    public asBinary(INode hijo) {
        super(hijo);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijo.evaluate().toBinaryNode();
    }
}
