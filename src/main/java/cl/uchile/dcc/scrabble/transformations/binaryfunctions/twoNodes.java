package cl.uchile.dcc.scrabble.transformations.binaryfunctions;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.types.iType;

public abstract class twoNodes implements INode {
    protected final INode hijoizq;
    protected final INode hijoder;

    /**
     * Constructor twoNodes
     * @param hijoizq nodo hijo izquierdo de tipo INode
     * @param hijoder nodo hijo derecho de tipo INode
     */
    protected twoNodes(INode hijoizq, INode hijoder) {
        this.hijoizq = hijoizq;
        this.hijoder = hijoder;
    }

    /**
     * Sobreescribe metodo evaluate
     * @return INode
     */
    @Override
    public iType getValue() {
        return this.evaluate().getValue();
    }
}
