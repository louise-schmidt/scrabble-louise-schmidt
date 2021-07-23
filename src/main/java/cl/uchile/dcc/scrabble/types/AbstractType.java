package cl.uchile.dcc.scrabble.types;

/**
 * Clase abstracta que contiene el método que concatena todos los tipos con un String
 */
public abstract class AbstractType implements iType{

    /**
     * Concatena un objeto cualquiera con un objeto StringType
     * @param addend
     * es del tipo StrinType y se concatena con algo
     * @return
     * un nuevo StringType que es el resultado de la concatenacion
     */
    @Override
    public StringType addToString(StringType addend) {
        return new StringType(this.toString() + addend.toString());
    }
}