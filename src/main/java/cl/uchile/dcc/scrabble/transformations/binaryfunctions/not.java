package cl.uchile.dcc.scrabble.transformations.binaryfunctions;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.transformations.unaryfunctions.oneNode;

public class not extends oneNode {

    /**
     * Constructor clase not
     * @param hijo nodo de tipo INode
     */
    public not(INode hijo) {
        super(hijo);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijo.evaluate().not();
    }
}
