package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.NodeType.BoolNode;
import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.types.iType;

/**
 * clase If cuenta con una condición, ifTrue e ifFalse
 */
public class If implements INode {
    private INode cond;
    private INode ifTrue;
    private INode ifFalse;

    /**
     * Constructor clase If
     * @param cond
     * corresponde a la condicion que se evalua
     * @param ifTrue
     * corresponde a cuando la condicion es true
     * @param ifFalse
     * corresponde a cuando la condicion es false
     */
    public If(INode cond, INode ifTrue, INode ifFalse) {
        this.cond = cond;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    /**
     * getter de If
     * @return
     * null
     */
    @Override
    public iType getValue() {
        return null;
    }

    /**
     * evalua el valor del objeto y utiliza ifTrue si la condicion es verdadera o ifFalse en caso contrario
     * @return
     * null
     */
    @Override
    public TypeNode evaluate() {
        if(((BoolNode) cond.evaluate()).getValue().getValue()) {
            this.ifTrue.evaluate();
        }
        else {
            this.ifFalse.evaluate();
        }
        return null;
    }
}
