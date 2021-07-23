package cl.uchile.dcc.scrabble.transformations.binaryfunctions;

import cl.uchile.dcc.scrabble.transformations.NodeType.INode;
import cl.uchile.dcc.scrabble.transformations.NodeType.TypeNode;

public class add extends twoNodes {

    public add(INode hijoizq, INode hijoder) {
        super(hijoizq, hijoder);
    }

    @Override
    public TypeNode evaluate() {
        return this.hijoizq.evaluate().add(this.hijoder.evaluate());
    }

}
