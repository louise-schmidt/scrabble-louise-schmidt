package cl.uchile.dcc.scrabble.gui;

public class FloatType extends NumbersType {
    private double Float;

    public FloatType(double Float) {
        this.Float=Float;
    }

    public double getFloat() {
        return Float;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getFloat());
    }

    @Override
    public FloatType ToFloat() {
        return this;
    }
}
