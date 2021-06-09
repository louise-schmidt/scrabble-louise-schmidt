package cl.uchile.dcc.scrabble.gui;

public abstract class Types implements iType {
    private String string;
    private boolean Bool;
    private double Float;
    private int Int;
    private String Binary;

    @Override
    public StringType ToStringS() {
        return new StringType(this.toString());
    }

    @Override
    public BoolType ToBool(){
        return null; }

    @Override
    public FloatType ToFloat(){
        return null;
    }

    @Override
    public IntType ToInt(){
        return null;
    }

    @Override
    public BinaryType ToBinary(){
        return null;
    }

}
