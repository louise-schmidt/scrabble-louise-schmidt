package cl.uchile.dcc.scrabble.gui;

public class StringType {
    private String string;

    public StringType(String string) {
        this.string=string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return this.getString();
    }





}
