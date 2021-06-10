package cl.uchile.dcc.scrabble.gui;

public class StringType extends Types {
    private String string;

    public StringType(String string) {
        this.string=string;
    }

    public String toString() {
        return string;
    }

    @Override
    public StringType toStringS() {
        return new StringType(this.string);
    }
}
