package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.functions.If;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.functions.While;

public interface IVisitor {

    /**
     * Metodo visitor de la operacion if
     * @param ifobject
     * es de tipo if
     */
    TypeNode visitIf(If ifobject);

    /**
     * Metodo visitor de la operacion while
     * @param whileobject
     * es de tipo while
     */
    TypeNode visitWhile(While whileobject);

}
