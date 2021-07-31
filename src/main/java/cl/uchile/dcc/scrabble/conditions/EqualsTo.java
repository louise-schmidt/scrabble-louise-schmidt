package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.twoNodes;
import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;

/**
 * Compara dos nodos con compareTo de java
 * retorna un nodo bool true si el valor del nodo izquierdo es igual que el valor del nodo derecho
 * o false en el caso contrario
 */
public class EqualsTo extends twoNodes {

    public EqualsTo(INode izq, INode der) {
        super(izq,der);
    }

    /**
     * compara los nodos de un arbol
     * @return
     * true si el hijo izquierdo es igual al derecho y false en caso contrario
     */
    @Override
    public TypeNode evaluate() {
        if(hijoizq.evaluate().compareTo(this.hijoder.evaluate())==0) {
            return NodeTypeFactory.newBoolNode(true);
        }
        else {
            return NodeTypeFactory.newBoolNode(false);
        }
    }
}
