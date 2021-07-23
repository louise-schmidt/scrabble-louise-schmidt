package cl.uchile.dcc.scrabble.transformations.binaryfunctions;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.NodeType.TypeNode;

public class multiply extends twoNodes {

    /**
     * Constructor clase multiply
     * @param hijoizq nodo izquierdo de tipo INode
     * @param hijoder nodo derecho de tipo INode
     */
    public multiply(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijoizq.evaluate().multiply(this.hijoder.evaluate());
    }
}
