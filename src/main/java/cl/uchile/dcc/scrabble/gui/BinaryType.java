package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

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
    public StringType ToStringS() {
        return super.ToStringS();
    }

    @Override
    public FloatType ToFloat() {
        return super.ToFloat();
    }

    @Override
    public IntType ToInt(String binary) {
        String binary = this.getBinary();
        if (bitToInt(binary.charAt(0)) == 0) {
            return positiveBinToInt(binary); }
        else {
            return negativeBinaryToInt(binary); }
        }
        private int negativeBinaryToInt(String binary) {
            int n = binary.length() - 1;
            int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
            for (int i = n, j = 0; i > 0; i--, j++) {
                w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0); }
            return w; }
        private int positiveBinToInt(String binary) {
            int w = 0;
            for (int i = binary.length() - 1, j = 0; i > 0; i--, j++) {
                w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i)); }
            return w; }
        private int bitToInt(char bit) { return bit == '0' ? 0 : 1; }
    }

    @Override
    public BinaryType ToBinary() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryType that = (BinaryType) o;
        return Objects.equals(Binary, that.Binary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Binary);
    }
}
