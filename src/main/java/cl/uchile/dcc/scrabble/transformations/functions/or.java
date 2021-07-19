package cl.uchile.dcc.scrabble.transformations.functions;
import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.twoNodes;

public class or extends twoNodes {

    /**
     * Constructor clase or
     * @param hijoizq nodo izquierdo tipo INode
     * @param hijoder nodo derecho tipo INode
     */
    public or(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }
}
