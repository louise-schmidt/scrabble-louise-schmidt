package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public class BoolType extends Types {
    private boolean Bool;

    public BoolType(boolean Bool) {
        this.Bool=Bool;
    }

    public boolean getBool() {
        return this.Bool;
    }

    public BoolType ToBoolType() {
        return new BoolType(this.Bool);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoolType boolType = (BoolType) o;
        return Bool == boolType.Bool;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Bool);
    }
}
