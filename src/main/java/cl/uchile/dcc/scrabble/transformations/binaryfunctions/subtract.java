package cl.uchile.dcc.scrabble.transformations.binaryfunctions;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.NodeType.TypeNode;

public class subtract extends twoNodes {

    /**
     * Constructor clase rest
     * @param hijoizq nodo izquierdo tipo INode
     * @param hijoder nodo derecho tipo INode
     */
    public subtract(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijoizq.evaluate().subtract(this.hijoder.evaluate());
    }
}
