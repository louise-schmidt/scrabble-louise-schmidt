package cl.uchile.dcc.scrabble.controlflujo.comparate;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.twoNodes;
import cl.uchile.dcc.scrabble.memory.NodesFactory.NodeTypeFactory;

public class LessThan extends twoNodes {

    public LessThan(INode izq, INode der) {
        super(izq,der);
    }

    @Override
    public TypeNode evaluate() {
        if(hijoizq.evaluate().compareTo(this.hijoder.evaluate())<0) {
            return NodeTypeFactory.newBoolNode(true);
        }
        else {
            return NodeTypeFactory.newBoolNode(false);
        }
    }

}


