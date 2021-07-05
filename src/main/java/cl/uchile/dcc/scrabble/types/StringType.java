package cl.uchile.dcc.scrabble.types;
import java.util.Objects;

public class StringType implements iType {
    private final String value;

    /**
     * get de StringType
     * @return tipo String
     */
    public String getValue() {
        return value;
    }

    /**
     * Constructor de StringType
     **/
    public StringType(String value) {
        this.value = value;
    }

    /**
     * Equals de StringType
     **/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StringType) {
            var o = (StringType) obj;
            return o.value == this.value;
        }
        return false;
    }

    /**
     * @return valor hash del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(StringType.class);
    }

    /**
     * Transformación StringType a StringType
     **/
    @Override
    public StringType asString() {
        return this;
    }

    /**
     * suma cualquier StringType con cualquier type
     * @param addend cualquier type
     * @return llama a addToString, el cual retorna un StringType
     */
    @Override
    public StringType addToString(StringType addend) {
        return new StringType(addend.toString()+this.toString());
    }

    /**
     * convierte a String un StringType
     */
    @Override
    public String toString() {
        return value;
    }
}
