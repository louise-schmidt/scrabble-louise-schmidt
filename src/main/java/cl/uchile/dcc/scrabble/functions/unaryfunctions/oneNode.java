package cl.uchile.dcc.scrabble.functions.unaryfunctions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.types.iType;

/**
 * Nodo con un solo hijo
 */
public abstract class oneNode implements INode {
    protected final INode hijo;

    /**
     * Constructor oneNode
     * @param hijo
     * de tipo INode
     */
    public oneNode (INode hijo) {
        this.hijo = hijo;
    }

    /**
     * Sobreescribe metodo evaluate de INode
     * @return
     * iType
     */
    @Override
    public iType getValue(){
        return this.evaluate().getValue();
    }

}
