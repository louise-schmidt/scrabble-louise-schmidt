package cl.uchile.dcc.scrabble.gui;

public class BoolType extends Types {
    private boolean Bool;

    public BoolType(boolean Bool) {
        this.Bool=Bool;
    }

    public boolean getBool() {
        return Bool;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getBool());
    }

    @Override
    // quizas es con getters ojo
    public BoolType ToBool() {
        return this;
    }



}
