package cl.uchile.dcc.scrabble.types;

public interface iType {
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

