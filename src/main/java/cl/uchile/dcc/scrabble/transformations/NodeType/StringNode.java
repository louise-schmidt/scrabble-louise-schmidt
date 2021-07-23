package cl.uchile.dcc.scrabble.transformations.NodeType;

import cl.uchile.dcc.scrabble.types.StringType;

public class StringNode extends Node {
    private final StringType value;

    public StringNode(StringType sString) {
        this.value = sString;
    }

    public StringNode evaluate(){
        return this;
    }

    public StringType getValue() {
        return this.value;
    }

    @Override
    public StringNode add(TypeNode addend){
        return addend.addToString(this);
    }

}
