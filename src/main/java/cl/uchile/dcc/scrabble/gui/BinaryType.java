package cl.uchile.dcc.scrabble.gui;

public class BinaryType extends NumbersType {
    private String Binary;

    public BinaryType(String Binary) {
        this.Binary=Binary;
    }

    public String getBinary() {
        return Binary;
    }

    @Override
    public String toString() {
        return this.getBinary();
    }

    @Override
    public BinaryType ToBinary() {
        return this;
    }
}
