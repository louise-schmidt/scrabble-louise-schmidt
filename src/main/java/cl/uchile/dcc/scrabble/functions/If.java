package cl.uchile.dcc.scrabble.functions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.Interfaz;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.visitor.ifWhileVisitor;

/**
 * clase If cuenta con una condición, ifTrue e ifFalse
 */
public class If implements Interfaz {
    private INode cond;
    private Interfaz ifTrue;
    private Interfaz ifFalse;

    /**
     * Constructor clase If
     * @param cond
     * corresponde a la condicion que se evalua
     * @param ifTrue
     * corresponde a cuando la condicion es true
     * @param ifFalse
     * corresponde a cuando la condicion es false
     */
    public If(INode cond, Interfaz ifTrue, Interfaz ifFalse) {
        this.cond = cond;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    /**
     * Metodo que acepta un visitor
     * @param visitor
     * es de tipo ifWhileVisitor
     * @return
     * un nuevo visitor de if
     */
    public TypeNode Accept(ifWhileVisitor visitor) {
        return visitor.visitIf(this);
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
     * Getter de la condicion if true
     * @return
     * la condicion if true
     */
    public Interfaz getIfTrue() {
        return ifTrue;
    }

    /**
     * Getter de la condicion if false
     * @return
     * la condicion if false
     */
    public Interfaz getIfFalse() {
        return ifFalse;
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
