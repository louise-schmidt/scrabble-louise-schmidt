package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class StringType extends Types {
    private String string;

    public StringType(String string) {
        this.string=string;
    }

    @Override
    public StringType toStringS() {
        return new StringType(this.string);
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
