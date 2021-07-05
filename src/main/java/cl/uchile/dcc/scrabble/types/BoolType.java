package cl.uchile.dcc.scrabble.types;
import cl.uchile.dcc.scrabble.types.operations.ILogical;
import java.util.Objects;

public class BoolType implements iType, ILogical {
    private final boolean value;

    /**
     * Constructor de BoolType
     **/
    public BoolType(boolean value) {
        this.value = value;
    }

    /**
     * Equals de BoolType
     **/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BoolType) {
            var o = (BoolType) obj;
            return o.value == this.value;
        }
        return false;
    }

    /**
     * @return valor hash del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(BoolType.class);
    }

    /**
     * get de BoolType
     * @return un boolean
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Transformacion BoolType a BinaryType
     **/
    public BoolType asBool() {
        return this;
    }

    /**
     * Transformacion BoolType a StringType
     **/
    @Override
    public StringType asString() {
        return new StringType(Boolean.toString(value));
    }

    /**
     * Suma de BoolType con StringType
     * @return llama a addToString, el cual retorna un nuevo StringType
     */
    @Override
    public StringType addToString(StringType addend) {
        return addend.addToString(this.asString());
    }

    /**
     * y logico entre BoolType y un operadoresLogicos
     */
    @Override
    public ILogical and(ILogical conjunct) {
        return conjunct.andBool(this);
    }

    /**
     * realiza la operación y logica entre dos boolean
     */
    @Override
    public ILogical andBool(ILogical bool) {
        if (!this.value || !Boolean.parseBoolean(bool.toString())) {
            return new BoolType(false);
        }
        else {
            return new BoolType(true);
        }
    }

    /**
     * o logico entre BoolType y un operadoresLogicos
     */
    @Override
    public ILogical or(ILogical operand) {
        return operand.orBool(this);
    }

    /**
     * realiza la operación o logica entre dos boolean
     */
    @Override
    public ILogical orBool(ILogical operand) {
        if (this.value || Boolean.parseBoolean(operand.toString())) {
            return new BoolType(false);
        }
        else {
            return new BoolType(true);
        }
    }

    @Override
    public ILogical andBinary(ILogical binarytype) {
        return null;
    }

}
