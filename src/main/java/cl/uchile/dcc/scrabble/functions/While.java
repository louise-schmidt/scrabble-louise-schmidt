package cl.uchile.dcc.scrabble.functions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.Interfaz;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.visitor.ifWhileVisitor;

/**
 * Clase while cuenta con una condicion y un whileTrue
 */
public class While implements Interfaz {
    public INode cond;
    public Interfaz whileTrue;

    /**
     * Constructor clase If
     * @param condition
     * corresponde a la condicion que se evalua
     * @param whileTrue
     * corresponde a cuando la condicion es true
     */
    public While(INode condition, Interfaz whileTrue) {
        this.cond = condition;
        this.whileTrue = whileTrue;
    }

    /**
     * Getter de la condicion
     * @return
     * la condicion
     */
    public INode getCond() {
        return cond;
    }

    /**
     * Metodo que acepta un visitor
     * @param visitor
     * es de tipo ifWhileVisitor
     * @return
     * un nuevo visitor de while
     */
    public TypeNode Accept(ifWhileVisitor visitor) {
        return visitor.visitWhile(this);
    }

    /**
     * Getter de la condicion while true
     * @return
     * la condicion while true
     */
    public Interfaz getWhileTrue() {
        return whileTrue;
    }

    /**
     * Evalua instancia el visitor
     * @return
     * metodo accept que recibe el visitor
     */
    @Override
    public TypeNode evaluate() {
        ifWhileVisitor Visitor = new ifWhileVisitor();
        return this.Accept(Visitor);
    }
}

