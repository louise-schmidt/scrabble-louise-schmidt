package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public class FloatType extends Types {
    private double Float;

    public FloatType(double Float) {
        this.Float=Float;
    }

    public double getFloat() { return this.Float; }

    public FloatType ToFloatType(){ return new FloatType(this.Float); }

    public FloatType suma(FloatType F) {
        FloatType f = this;
        double d = F.getFloat();
        return f.operacionFloatType(d, "suma");
    }

    public FloatType suma(IntType I) {
        FloatType f = this;
        double d = (I.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "suma");
    }

    public FloatType suma(BinaryType B) {
        IntType iB = B.ToIntType();
        FloatType f = this;
        double d = (iB.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "suma");
    }

    public FloatType resta(FloatType F) {
        FloatType f = this;
        double d = F.getFloat();
        return f.operacionFloatType(d, "resta");
    }

    public FloatType resta(IntType I) {
        FloatType f = this;
        double d = (I.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "resta");
    }

    public FloatType resta(BinaryType B) {
        IntType iB = B.ToIntType();
        FloatType f = this;
        double d = (iB.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "resta");
    }

    public FloatType mult(FloatType F) {
        FloatType f = this;
        double d = F.getFloat();
        return f.operacionFloatType(d, "multiplicacion");
    }

    public FloatType mult(IntType I) {
        FloatType f = this;
        double d = (I.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "multiplicacion");
    }

    public FloatType mult(BinaryType B) {
        IntType iB = B.ToIntType();
        FloatType f = this;
        double d = (iB.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "multiplicacion");
    }

    public FloatType division(FloatType F) {
        FloatType f = this;
        double d = F.getFloat();
        return f.operacionFloatType(d, "division");
    }

    public FloatType division(IntType I) {
        FloatType f = this;
        double d = (I.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "division");
    }

    public FloatType division(BinaryType B) {
        IntType iB = B.ToIntType();
        FloatType f = this;
        double d = (iB.ToFloatType()).getFloat();
        return f.operacionFloatType(d, "division");
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
