package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.NodeType.BoolNode;
import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.types.iType;

/**
 * Clase while cuenta con una condicion y un whileTrue
 */
public class While implements INode {
    public INode cond;
    public INode whileTrue;

    /**
     * Constructor clase If
     * @param condition
     * corresponde a la condicion que se evalua
     * @param whileTrue
     * corresponde a cuando la condicion es true
     */
    public While(INode condition, INode whileTrue) {
        this.cond = condition;
        this.whileTrue = whileTrue;
    }

    /**
     * getter de While
     * @return
     * el objeto
     */
    @Override
    public iType getValue() {
        return null;
    }

    /**
     * evalua el valor del objeto mientras que la condicion sea true
     * @return
     * null, se detiene el while
     */
    @Override
    public TypeNode evaluate() {
        while(((BoolNode) cond.evaluate()).getValue().getValue()) {
            whileTrue.evaluate();
        }
        return null;
    }
}

