package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class StringType extends Types {
    private String string;

    public StringType(String string) {
        this.string=string;
    }

    public StringType sumaS(StringType string) {
        String s=string.toString();
        return new StringType(this.string+s);
    }

    public StringType sumaS(BoolType bool) {
        String b=bool.toString();
        return new StringType(this.string+b);
    }

    public StringType sumaS(FloatType Float) {
        String f=Float.toString();
        return new StringType(this.string+f);
    }

    public StringType sumaS(IntType Int) {
        String i=Int.toString();
        return new StringType(this.string+i);
    }

    public StringType sumaS(BinaryType binary) {
        String bi=binary.toString();
        return new StringType(this.string+bi);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringType that = (StringType) o;
        return Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
