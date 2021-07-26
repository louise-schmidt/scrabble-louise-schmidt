package cl.uchile.dcc.scrabble.functions.unaryfunctions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.unaryfunctions.oneNode;

public class not extends oneNode {

    /**
     * Constructor clase not
     * @param hijo nodo de tipo INode
     */
    public not(INode hijo) {
        super(hijo);
    }

    /**
     * Evalua el hijo de oneNode
     * @return
     * TypeNode con el valor
     */
    @Override
    public TypeNode evaluate() {
        return this.hijo.evaluate().not();
    }
}
