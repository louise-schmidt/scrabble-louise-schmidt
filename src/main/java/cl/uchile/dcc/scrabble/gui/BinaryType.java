package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class BinaryType extends Types {
    private String Binary;

    public BinaryType(String Binary) {
        this.Binary=Binary;
    }

    public String getBinary() {
        return this.Binary;
    }

    public IntType ToIntType() { return new IntType(this.ToInt()); }

    /*
    public BinaryType ToBinary() { return new BinaryType(this.Binary); }
     */

    @Override
    public StringType ToStringS() {
        return super.ToStringS();
    }

    public FloatType ToFloat(String Binary) {
        double i=(double)this.ToInt();
        return new FloatType(i);
    }

    public int ToInt() {
        String Binary = this.getBinary();
        if (bitToInt(this.Binary.charAt(0)) == 0) { return positiveBinToInt(Binary); }
        else { return negativeBinaryToInt(Binary); }
        }
    private int negativeBinaryToInt(String binary) {
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0); }
        return w;
    }
    private int positiveBinToInt(String binary) {
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i)); }
        return w;
    }
    private int bitToInt(char bit) { return bit == '0' ? 0 : 1;
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
