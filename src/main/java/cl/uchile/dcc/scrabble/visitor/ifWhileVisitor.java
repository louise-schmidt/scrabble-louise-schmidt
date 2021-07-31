package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.functions.If;
import cl.uchile.dcc.scrabble.functions.NodeType.BoolNode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.While;

public class ifWhileVisitor implements IVisitor {

    /**
     * evalua el valor del objeto mientras que la condicion sea true
     * @return
     * null, se detiene el while
     */
    @Override
    public TypeNode visitWhile(While whileobject) {
        while(((BoolNode) whileobject.getCond().evaluate()).getValue().getValue()) {
            whileobject.getWhileTrue().evaluate();
        }
        return null;
    }

    /**
     * evalua el valor del objeto y utiliza ifTrue si la condicion es verdadera o ifFalse en caso contrario
     */
    public TypeNode visitIf(If ifobject) {
        if(((BoolNode) ifobject.getCond().evaluate()).getValue().getValue()) {
            return ifobject.getIfTrue().evaluate();
        }
        else {
            return ifobject.getIfFalse().evaluate();
        }
    }
}
