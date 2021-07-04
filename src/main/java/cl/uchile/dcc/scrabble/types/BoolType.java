package cl.uchile.dcc.scrabble.types;

import java.util.Objects;

/**
 * Subclase para el Bool de Scrabble
 * Extiende la clase Type
 */
public class BoolType extends AbstractType {
    private boolean Bool;

    /**
     * Constructor BoolType
     * @param Bool es de tipo boolean de Java
     */
    public BoolType(boolean Bool) {
        this.Bool=Bool;
    }

    public BoolType ToBoolType() {
        return new BoolType(this.Bool);
    }



    public BoolType negacion() {
        return new BoolType(!(this.Bool));
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
