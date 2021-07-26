package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.types.iType;

public interface INode {

    /**
     * Getter de nodos
     * @return
     * iType
     */
    iType getValue();

    /**
     * Evalua los nodos
     * @return
     * TypeNode
     */
    TypeNode evaluate();
}
