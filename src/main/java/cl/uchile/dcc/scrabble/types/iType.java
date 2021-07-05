package cl.uchile.dcc.scrabble.types;
import cl.uchile.dcc.scrabble.ast.INode;

public interface iType extends INode {
    /**
     * Pasa un objeto cualquiera a un objeto de tipo StringType
     * @return un StringType
     */
    StringType asString();

    /**
     * Concatena un StringType con otro StringType
     * @param addend es del tipo StrinType
     * @return una concatenacion de tipo StringType
     */
    StringType addToString(StringType addend);



}

