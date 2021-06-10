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

    @Override
    public BinaryType ToBinary(int in) {
        if(in<0){

        }
        else{
            int[] binary = new int[in.lenght];
        }


        public twoscomplement(Int I){

        }

        return super.ToBinary();
    }

}
