package cl.uchile.dcc.scrabble.transformations.unaryfunctions.transform;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.transformations.unaryfunctions.oneNode;

public class asBool extends oneNode {
    public asBool(INode hijo) {
        super(hijo);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijo.evaluate().toBoolNode();
    }
}
