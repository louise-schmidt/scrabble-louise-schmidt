package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class IntType extends Types {
    private int Int;

    public IntType(int Int) {
        this.Int=Int;
    }

    public int getInt() {
        return Int;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getInt());
    }

    @Override
    public StringType ToStringS() {
        return new StringType(this.toString());
    }

    @Override
    public FloatType ToFloat() {
        return new FloatType(this.getInt());
    }

    @Override
    public IntType ToInt() {
        return this;
    }

    public BinaryType ToBinary(int in) {
        int length = 0;
        int contador = 0;
        in = Math.abs(in);
        while ((2 ^ contador) < in) {
            length++;
            contador++;
        }
        int a[] = new int[length];
        for(int i=0; i<length; i++) {
            a[i] = in % 2;
            in = in / 2;
        }
        if (in < 0) {
            for (int i = 0; i < length; i++) {
                if (a[i] == 1) {
                    a[i]= 0;
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
                } else {
                    if (a[i] == 1) {
                        a[i] = 1;
                    } else {
                        a[i] = 0;
                    }
                }
            }
        }
        String answer = java.util.Arrays.toString(a);
        return new BinaryType(answer);
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
