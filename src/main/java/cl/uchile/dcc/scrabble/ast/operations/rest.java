package cl.uchile.dcc.scrabble.ast.operations;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.ast.twoNodes;

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
