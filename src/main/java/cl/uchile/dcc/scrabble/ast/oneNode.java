package cl.uchile.dcc.scrabble.ast;
import cl.uchile.dcc.scrabble.types.iType;

public abstract class oneNode implements INode {
    private INode hijo;

    /**
     * Constructor oneNode
     * @param hijo de tipo INode
     */
    public oneNode (INode hijo) {
        this.hijo = this;
    }

    /**
     * getter nodo hijo
     * @return INode
     */
    public INode getHijo() {
        return hijo;
    }

    /**
     * Sobreescribe metodo evaluate de INode
     * @return iType
     */
    @Override
    public iType evaluate() {
        return null;
    }

}
