package cl.uchile.dcc.scrabble.gui;

public class FloatType extends NumbersType {
    private double Float;

    public FloatType(double Float) {
        this.Float=Float;
    }

    public double getFloat() {
        return Float;
    }

    public StringType FloatToString(){


    }

    public FloatType FloatToFloat(FloatType F){
        return F;
    }



}
