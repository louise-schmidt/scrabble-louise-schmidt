package cl.uchile.dcc.scrabble.types;

public abstract class AbstractType implements iType{

    @Override
    public StringType addToString(StringType addend) {
        return new StringType(this + addend.toString());
    }
}