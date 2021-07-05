package cl.uchile.dcc.scrabble.ast.operations;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.ast.twoNodes;

public class and extends twoNodes {

    /**
     * Constructor clase and
     * @param hijoizq nodo izquierdo de tipo INode
     * @param hijoder nodo derecho de tipo INode
     */
    public and(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }
}
