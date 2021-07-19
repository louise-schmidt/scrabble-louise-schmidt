package cl.uchile.dcc.scrabble.transformations.functions;
import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.twoNodes;

public class rest extends twoNodes {

    /**
     * Constructor clase rest
     * @param hijoizq nodo izquierdo tipo INode
     * @param hijoder nodo derecho tipo INode
     */
    public rest(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }
}
