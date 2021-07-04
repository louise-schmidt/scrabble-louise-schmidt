package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.FloatType;

import java.util.Objects;

public class StringType implements iType {
    private final String value;

    /**
     * get de SString
     * @return tipo String
     */
    public String getValue() {
        return value;
    }

    /**
     * Constructor de SString
     **/
    public StringType(String value) {
        this.value = value;
    }

    /**
     * Equals de SString
     **/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StringType) {
            var o = (StringType) obj;
            return o.value == this.value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(StringType.class);
    }

    /**
     * Transformación SString a SString
     **/
    @Override
    public StringType asString() {
        return this;
    }

    /**
     * suma cualquier SString con cualquier STipos
     * @param addend cualquier STipos
     * @return llama a addToString, el cual retorna un SString
     */
    @Override
    public StringType addToString(StringType addend) {
        return new StringType(addend.toString()+this.toString());
    }

    /**
     * convierte a String un SString
     */
    @Override
    public String toString() {
        return value;
    }
}
