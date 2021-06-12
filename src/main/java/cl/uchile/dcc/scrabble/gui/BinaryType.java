package cl.uchile.dcc.scrabble.gui;
import java.net.NetworkInterface;
import java.util.Objects;

public class BinaryType extends Types {
    private String Binary;

    public BinaryType(String Binary) {
        this.Binary=Binary;
    }

    public String getBinary() {
        return this.Binary;
    }

    public IntType ToIntType() { return new IntType(this.getInt()); }

    @Override
    public StringType ToStringS() {
        return super.ToStringS();
    }

    public FloatType ToFloat(String Binary) {
        double i=(double)this.getInt();
        return new FloatType(i);
    }

    public int getInt() {
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

    public BinaryType suma(IntType I) {
        BinaryType b = this;
        IntType ib = b.ToIntType();
        IntType it = ib.suma(I);
        return it.getBinary();
    }

    public BinaryType suma(BinaryType B) {
        BinaryType b = this;
    }

    public BinaryType resta(IntType I) {
        BinaryType b = this;
        IntType ib = b.ToIntType();
        IntType it = ib.resta(I);
        return it.getBinary();
    }

    public BinaryType resta(BinaryType B) {
    }

    public BinaryType mult(IntType I) {
        BinaryType b = this;
        IntType ib = b.ToIntType();
        IntType it = ib.mult(I);
        return it.getBinary();
    }

    public BinaryType mult(BinaryType B) {
    }

    public BinaryType division(IntType I) {
        BinaryType b = this;
        IntType ib = b.ToIntType();
        IntType it = ib.division(I);
        return it.getBinary();
    }

    public BinaryType division(BinaryType B) {
    }

    public BinaryType negacion() {
        int i = Integer.valueOf(this.Binary);
        int largo = this.Binary.length();
        return new BinaryType(String.valueOf(i));
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
