package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;

public interface Iiterator {

    /**
     * Getter de la condicion para el if o while
     * @return
     * un INode
     */
    INode getCond();

    /**
     *
     * @param ivisitor
     */
    void Accept(IVisitor ivisitor);
}
