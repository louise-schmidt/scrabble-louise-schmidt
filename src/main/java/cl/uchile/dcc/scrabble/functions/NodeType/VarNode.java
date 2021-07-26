package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.types.iType;

public class VarNode implements INode {

    private final String id;
    private TypeNode value;

    public VarNode(String id){
        this.id = id;
    }

    public TypeNode evaluate(){
        return this.value;
    }

    public iType getValue(){
        return this.value.getValue();
    }

    public void setValue(TypeNode value){
        this.value = value;
    }
}
