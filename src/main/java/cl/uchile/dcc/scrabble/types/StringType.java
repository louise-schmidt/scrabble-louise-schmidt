package cl.uchile.dcc.scrabble.types;

import java.util.Objects;

/**
 * La clase StringType genera un objeto del tipo String
 * Representan un string
 */
public class StringType extends AbstractType implements Comparable<StringType> {

    /**
     * valor inmutable del StringType
     */
    private final String value;

    /**
     * Crea un StringType con valor "value"
     * @param value
     * el String que será de tipo StringType
     **/
    public StringType(String value) {
        this.value = value;
    }

    /**
     * Retorn el valor del objeto StringType como un objeto de tipo String
     * @return
     * la representacion de tipo String del objeto
     */
    public String getValue() {
        return value;
    }

    /**
     * Compara el objeto this con el objeto o
     * Son iguales si el argumento es un StringType del mismo valor que el objeto
     * @param obj
     * el objeto con el que se compara
     * @return
     * true si los objetos son iguales o false en el caso contrario
     **/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StringType) {
            var o = (StringType) obj;
            return Objects.equals(o.value,this.value);
        }
        return false;
    }

    /**
     * Retorna un hashCode para StringType
     * @return
     * un hash code para el objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getValue());
    }

    /**
     * Retorna un tipo StringType representando el valor del objeto StringType
     * @return
     * un objeto StrinType
     */
    @Override
    public StringType asString() {
        return this;
    }

    /**
     * Retorna un objeto de tipo String representando el valor del objeto
     * @return
     * un String
     */
    @Override
    public String toString() {
        return value;
    }

    //Concatenacion
    public StringType add(iType addend) {
        return addend.addToString(this);
    }

    /**
     * Compara un StringType con un StringType
     * @param stringtype
     * el objeto que se utilizara para comparar
     * @return
     * un int menor, mayor o igual a 0 segun si this es menor, mayor o igual a stringtype
     */
    @Override
    public int compareTo(StringType stringtype) {
        return this.getValue().compareTo(stringtype.getValue());
    }

}
