package cl.uchile.dcc.scrabble.ast.operations;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.ast.twoNodes;

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
