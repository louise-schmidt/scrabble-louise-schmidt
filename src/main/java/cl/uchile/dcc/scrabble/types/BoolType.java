package cl.uchile.dcc.scrabble.types;
import cl.uchile.dcc.scrabble.types.operations.ILogical;

public class BoolType implements iType, ILogical {
    private final boolean value;

    /**
     * Constructor de SBool
     **/
    public BoolType(boolean value) {
        this.value = value;
    }

    /**
     * Equals de SBool
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
     * get de SBool
     * @return un boolean
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Transformacion SBool a SBool
     **/
    public BoolType asBool() {
        return this;
    }

    /**
     * Transformacion SBool a SString
     **/
    @Override
    public StringType asString() {
        return new StringType(Boolean.toString(value));
    }

    /**
     * Suma de SBool con SString
     * @return llama a addToString, el cual retorna un nuevo SString
     */
    @Override
    public StringType addToString(StringType addend) {
        return addend.addToString(this.asString());
    }

    /**
     * y logico entre SBool y un operadoresLogicos
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
     * o logico entre SBool y un operadoresLogicos
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
    public ILogical andBinary(ILogical sBinary) {
        return null;
    }

}
