package cl.uchile.dcc.scrabble.ast.operations;
import cl.uchile.dcc.scrabble.ast.INode;
import cl.uchile.dcc.scrabble.ast.twoNodes;
import cl.uchile.dcc.scrabble.types.iType.*;
import cl.uchile.dcc.scrabble.types.numbers.INumbers.*;

public class add extends twoNodes {

    /**
     * Constructor metodo add
     * @param hijoizq corresponde al hijo izquierdo
     * @param hijoder corresponde al hijo derecho
     */
    public add(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }

}
