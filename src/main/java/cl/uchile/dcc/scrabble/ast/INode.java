package cl.uchile.dcc.scrabble.ast;
import cl.uchile.dcc.scrabble.types.iType;

public interface INode {
    /**
     * metodo evaluate retorna objeto del tipo INode
     * @return INode
     */
    public INode evaluate();
}
