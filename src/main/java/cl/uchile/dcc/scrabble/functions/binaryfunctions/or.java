package cl.uchile.dcc.scrabble.functions.binaryfunctions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;

public class or extends twoNodes {

    /**
     * Constructor clase or
     * @param hijoizq nodo izquierdo tipo INode
     * @param hijoder nodo derecho tipo INode
     */
    public or(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijoizq.evaluate().or(this.hijoder.evaluate());
    }
}
