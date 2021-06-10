package cl.uchile.dcc.scrabble.gui;

public class IntType extends NumbersType {
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
        String s = "0";
        String s3 = "";
        String s2 = "";
        while ((2 ^ contador) < in) {
            length++;
            contador++;
            in = Math.abs(in);
        }
        while (in > 0) {
            s = s + Integer.toString(in % 2);
            in = in / 2;
        }
        if (in < 0) {
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) == '1') {
                    s2 += "0";
                } else {
                    s2 += "1";
                }
            }
            boolean b = true;
            for (int i = length; i > 0; i--) {
                if (b) {
                    if (s2.charAt(i) == '1') {
                        s3 = "0" + s3;
                    } else {
                        s3 = "1" + s3;
                        b = false;
                    }
                } else {
                    if (s2.charAt(i) == '1') {
                        s3 = "1" + s3;
                    } else {
                        s3 = "0" + s3;
                    }
                }
            }
        }
        return new BinaryType(s3);
    }
}
