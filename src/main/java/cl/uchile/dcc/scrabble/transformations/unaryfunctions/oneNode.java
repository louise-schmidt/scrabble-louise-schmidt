package cl.uchile.dcc.scrabble.transformations.unaryfunctions;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.types.iType;

public abstract class oneNode implements INode {
    protected final INode hijo;

    /**
     * Constructor oneNode
     * @param hijo de tipo INode
     */
    public oneNode (INode hijo) {
        this.hijo = this;
    }

    /**
     * Sobreescribe metodo evaluate de INode
     * @return iType
     */
    @Override
    public iType getValue(){
        return this.evaluate().getValue();
    }

}
