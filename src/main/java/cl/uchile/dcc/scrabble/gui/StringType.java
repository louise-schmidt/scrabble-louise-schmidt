package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public class StringType extends Types {
    private String string;

    /**
     *
     * @param string
     */
    public StringType(String string) {
        this.string=string;
    }

    /**
     *
     * @param string
     * @return
     */
    public StringType suma(StringType string) {
        String s=string.getString();
        return new StringType(this.string+s);
    }

    /**
     *
     * @param bool
     * @return
     */
    public StringType suma(BoolType bool) {
        String b=bool.getString();
        return new StringType(this.string+b);
    }

    /**
     *
     * @param Float
     * @return
     */
    public StringType suma(FloatType Float) {
        String f=Float.getString();
        return new StringType(this.string+f);
    }

    /**
     *
     * @param Int
     * @return
     */
    public StringType suma(IntType Int) {
        String i=Int.getString();
        return new StringType(this.string+i); }

    /**
     *
     * @param binary
     * @return
     */
    public StringType suma(BinaryType binary) {
        String bi=binary.getString();
        return new StringType(this.string+bi);
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringType that = (StringType) o;
        return Objects.equals(string, that.string);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
