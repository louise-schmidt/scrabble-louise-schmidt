package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public class IntType extends Types {
    private int Int;

    public IntType(int Int) {
        this.Int=Int;
    }

    public int getInt() {
        return this.Int;
    }

    @Override
    public StringType ToStringS() {
        return new StringType(this.toString());
    }

    public FloatType ToFloatType() { return new FloatType(this.getInt()); }

    public BinaryType getBinary() {
        int length = 0;
        while ((2 ^ length) <= Math.abs(this.Int)) {
            length++;
        }
        int a[] = new int[length];
        for(int i=0; i<length; i++) {
            a[i] = this.Int % 2;
            this.Int = this.Int / 2;
        }
        if (this.Int < 0) {
            for (int i = 0; i < length; i++) {
                if (a[i] == 1) {
                    a[i] = 0;
                } else {
                    a[i] = 1;
                }
            }
            boolean b = true;
            for (int i = length; i > 0; i--) {
                if (b) {
                    if (a[i] == 1) {
                        a[i] = 0;
                    } else {
                        a[i] = 1;
                        b = false;
                    }
                } else { break; }
            }
            String s="1";
            for(int i=length; i>0; i++) {
                s+=String.valueOf(a[i]);
            }
            return new BinaryType(s);
        }
        String s="0";
        for(int i=length; i>0; i++) {
            s+=String.valueOf(a[i]);
        }
        return new BinaryType(s);
    }

    public FloatType suma(FloatType F) { return F.suma(this); }

    public IntType suma(IntType I) {
        IntType i = this;
        int in = I.getInt();
        return i.operacionIntType(in, "suma");
    }

    public IntType suma(BinaryType B) {
        IntType i = this;
        int iB = B.getInt();
        return i.operacionIntType(iB, "suma");
    }

    public FloatType resta(FloatType F) { return F.resta(this); }

    public IntType resta(IntType I) {
        IntType i = this;
        int in = I.getInt();
        return i.operacionIntType(in, "resta");
    }

    public IntType resta(BinaryType B) {
        IntType i = this;
        int in = B.getInt();
        return i.operacionIntType(in, "resta");
    }

    public FloatType mult(FloatType F) { return F.mult(this); }

    public IntType mult(IntType I) {
        IntType i = this;
        int in = I.getInt();
        return i.operacionIntType(in, "multiplicacion");
    }

    public IntType mult(BinaryType B) {
        IntType i = this;
        int in = B.getInt();
        return i.operacionIntType(in, "multiplicacion");
    }

    public FloatType division(FloatType F) { return F.mult(this); }

    public IntType division(IntType I) {
        IntType i = this;
        int in = I.getInt();
        return i.operacionIntType(in, "division");
    }

    public IntType division(BinaryType B) {
        IntType i = this;
        int in = B.getInt();
        return i.operacionIntType(in, "division");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntType intType = (IntType) o;
        return Int == intType.Int;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Int);
    }
}
