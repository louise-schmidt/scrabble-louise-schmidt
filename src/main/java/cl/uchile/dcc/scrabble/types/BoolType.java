package cl.uchile.dcc.scrabble.types;


import cl.uchile.dcc.scrabble.memory.TypesFactory.BinaryFactory;
import cl.uchile.dcc.scrabble.memory.TypesFactory.TypeFactory;
import cl.uchile.dcc.scrabble.operations.ILogical;
import cl.uchile.dcc.scrabble.types.numbers.BinaryType;


public class BoolType extends AbstractType implements iType, ILogical {
    private final boolean value;

    public BoolType(boolean aBool) {
        this.value = aBool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoolType)) return false;
        BoolType booleano = (BoolType) o;
        return this.getValue() == booleano.getValue();
    }


    @Override
    public int hashCode() {
        return this.getValue() ? 1231 : 1237;
    }

    public boolean getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }


    public StringType asString() {
        return TypeFactory.getStringType(this.toString());
    }

    public BoolType asBool() {
        return this;
    }

    @Override
    public ILogical and(ILogical operand) {
        return operand.andBool(this);
    }

    @Override
    public BoolType andBool(BoolType sBool) {
        return TypeFactory.getBoolType(sBool.getValue() && this.getValue());
    }

    @Override
    public BinaryType andBinary(BinaryType sBinary) {
        return TypeFactory.getBinaryType(this.getValue() ? sBinary.getValue() : "0000000000000000");
    }

    @Override
    public ILogical or(ILogical operand) {
        return operand.orBool(this);
    }

    @Override
    public BoolType orBool(BoolType sBool) {
        return TypeFactory.getBoolType(sBool.getValue() || this.getValue());
    }


    @Override
    public BinaryType orBinary(BinaryType sBinary) {
        return TypeFactory.getBinaryType(this.getValue() ? "1111111111111111" : sBinary.getValue());
    }

    @Override
    public BoolType not(){
        return TypeFactory.getBoolType(!this.getValue());
    }
}
