package cl.uchile.dcc.scrabble.ast.operations;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.ast.twoNodes;


public class divide extends twoNodes {
    /**
     * Constructor clase divide
     * @param hijoizq nodo izquierdo de tipo INode
     * @param hijoder nodo derecho de tipo INode
     */
    public divide(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }
}
