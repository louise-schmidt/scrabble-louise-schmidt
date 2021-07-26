package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.types.iType;

public interface INode {

    iType getValue();
    TypeNode evaluate();
}
