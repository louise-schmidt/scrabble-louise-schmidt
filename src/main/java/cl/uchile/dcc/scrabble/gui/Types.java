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

    public String toString() {
        return String.valueOf(this);
    }

    public StringType sumaS() {
        return ;
    }

}
