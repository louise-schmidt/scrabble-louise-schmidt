package cl.uchile.dcc.scrabble.functions.unaryfunctions.transform;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.unaryfunctions.oneNode;

/**
 * Clase que pasa nodo a StringNode
 */
public class asString extends oneNode {
    public asString(INode hijo) {
        super(hijo);
    }

    /**
     * Evalua el hijo del nodo
     * @return
     * un nodo de tipo scrabble
     */
    @Override
    public TypeNode evaluate() {
        return this.hijo.evaluate().toStringNode();
    }
}
