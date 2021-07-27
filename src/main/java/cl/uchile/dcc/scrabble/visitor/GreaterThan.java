package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.binaryfunctions.twoNodes;
import cl.uchile.dcc.scrabble.factories.NodesFactory.NodeTypeFactory;

/**
 * Compara dos nodos con compareTo de java
 * retorna un nodo bool true si el valor del nodo izquierdo es mayor que el valor del nodo derecho
 * o false en el caso contrario
 */
public class GreaterThan extends twoNodes {
    public GreaterThan(INode izq, INode der) {
        super(izq,der);
    }

    /**
     * compara los nodos de un arbol
     * @return
     * true si el hijo izquierdo es mayor que el hijo derecho y false en caso contrario
     */
    @Override
    public TypeNode evaluate() {
        if(hijoizq.evaluate().compareTo(this.hijoder.evaluate())==1) {
            return NodeTypeFactory.newBoolNode(true);
        }
        else {
            return NodeTypeFactory.newBoolNode(false);
        }
    }
}
