package cl.uchile.dcc.scrabble.ast;

import cl.uchile.dcc.scrabble.types.iType;

public abstract class oneNode implements INode {
    private INode hijo;

    /**
     *
     * @param hijo
     */
    public oneNode (INode hijo) {
        this.hijo = this;
    }

    /**
     *
     * @return
     */
    public INode getHijo() {
        return hijo;
    }

    /**
     *
     * @return
     */
    @Override
    public iType evaluate() {
        return null;
    }

}
