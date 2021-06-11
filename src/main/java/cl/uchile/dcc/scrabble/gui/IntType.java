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

    public FloatType ToFloatType() {
        return new FloatType(this.getInt());
    }

    public IntType ToInt() {
        return this;
    }

    public BinaryType ToBinary(int in) {
        int length = 0;
        while ((2 ^ length) <= Math.abs(in)) {
            length++;
        }
        int a[] = new int[length];
        for(int i=0; i<length; i++) {
            a[i] = in % 2;
            in = in / 2;
        }
        if (in < 0) {
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
            String answer = java.util.Arrays.toString(a);
            return new BinaryType('1'+answer);
        }
        String answer = java.util.Arrays.toString(a);
        return new BinaryType('0'+answer);
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
