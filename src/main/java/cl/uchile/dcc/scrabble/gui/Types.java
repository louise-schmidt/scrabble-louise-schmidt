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

    public FloatType operacionFloatType(double d, String s) {
        if(s=="suma") {
            return new FloatType(this.Float+d);
        } else if(s=="resta"){
            return new FloatType(this.Float-d);
        } else if(s=="multiplicacion"){
            return new FloatType(this.Float*d);
        } else {
            return new FloatType(this.Float/d); }
    }

    public IntType operacionIntType(int i, String s) {
        if(s=="suma") {
            return new IntType(this.Int+i);
        } else if(s=="resta"){
            return new IntType(this.Int-i);
        } else if(s=="multiplicacion"){
            return new IntType(this.Int*i);
        } else {
            return new IntType((int)(this.Int/i)); }
    }

    public BinaryType operacionBinaryType(String b, String s) {
        if(s=="suma") {
            return new BinaryType(b);
        } else if(s=="resta"){
            return new BinaryType(b);
        } else if(s=="multiplicacion"){
            return new BinaryType(b);
        } else {
            return new BinaryType((b); }
    }


}
