package cl.uchile.dcc.scrabble.functions.NodeType;

import cl.uchile.dcc.scrabble.types.iType;

/**
 * Clase de nodo variable
 * implementa la clase INode
 */
public class VarNode implements INode {

    private final String id;
    private TypeNode value;

    /**
     * Constructor VarNode
     * @param id
     * String
     */
    public VarNode(String id){
        this.id = id;
    }

    /**
     * Evaluate
     * @return
     * TypeNode
     */
    public TypeNode evaluate(){
        return this.value;
    }

    /**
     * Getter de VarNode
     * @return
     * iType
     */
    public iType getValue(){
        return this.value.getValue();
    }

    /**
     * Setter de VarNode
     * @param value
     * this
     */
    public void setValue(TypeNode value){
        this.value = value;
    }
}
