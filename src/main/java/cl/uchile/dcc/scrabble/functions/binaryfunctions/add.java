package cl.uchile.dcc.scrabble.functions.binaryfunctions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;

public class add extends twoNodes {

    public add(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijoizq.evaluate().add(this.hijoder.evaluate());
    }

}
