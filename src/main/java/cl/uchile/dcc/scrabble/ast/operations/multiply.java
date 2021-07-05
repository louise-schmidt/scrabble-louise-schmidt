package cl.uchile.dcc.scrabble.ast.operations;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.ast.twoNodes;

public class multiply extends twoNodes {

    /**
     * Constructor clase multiply
     * @param hijoizq nodo izquierdo de tipo INode
     * @param hijoder nodo derecho de tipo INode
     */
    public multiply(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }
}
