package cl.uchile.dcc.scrabble.conditions;

import cl.uchile.dcc.scrabble.functions.NodeType.INode;
import cl.uchile.dcc.scrabble.functions.NodeType.TypeNode;
import cl.uchile.dcc.scrabble.factories.NodesFactory.VarNodeFactory;
import cl.uchile.dcc.scrabble.types.iType;

/**
 * Clase Assign le asigna un valor val a una variable var
 */
public class Assign implements INode {

    private String var;
    private INode val;

    /**
     * Constructor Assign
     * @param var
     * la variable a la que se le asignara un valor
     * @param val
     * el valor que se asigna a la variable
     */
    public Assign (String var, INode val) {
        this.var = var;
        this.val = val;
    }

    /**
     * Evalua el contenido de un VarNode
     * @return
     * null
     */
    @Override
    public TypeNode evaluate() {
        VarNodeFactory.getVarNode(this.var).setValue(this.val.evaluate());
        return null;
    }

    /**
     * Getter de Assign
     * @return
     * null
     */
    @Override
    public iType getValue() {
        return null;
    }
}
