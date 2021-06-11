package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FloatType floatType = (FloatType) o;
        return Double.compare(floatType.Float, Float) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Float);
    }
}
